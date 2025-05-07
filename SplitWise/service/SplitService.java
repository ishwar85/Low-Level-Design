package SplitWise.service;


import SplitWise.model.Transaction;

import SplitWise.startegy.SplitStrategy;
import SplitWise.startegy.SplitStrategyFactory;

import java.util.HashMap;

import java.util.Map;

public class SplitService {
    Map<String, Map<String, Double>> balanceSheet = new HashMap<>();

    public void addTransaction(Transaction tx) {
        SplitStrategy strategy = SplitStrategyFactory.getStrategy(tx.getSplitType());
        Map<String, Double> calculatedSplit =
                strategy.calculateSplits(tx.getAmount(), tx.getInvolvedUserIds(), tx.getShareList());

        for (String userId : tx.getInvolvedUserIds()) {
            if (userId.equals(tx.getPaidByUserId())) continue;

            double owed = calculatedSplit.get(userId);
            Map<String, Double> userBalances = balanceSheet.computeIfAbsent(userId, k -> new HashMap<>());
            userBalances.put(tx.getPaidByUserId(), userBalances.getOrDefault(tx.getPaidByUserId(), 0.0) + owed);
        }
    }

    public void showBalances() {
        for (String user : balanceSheet.keySet()) {
            for (Map.Entry<String, Double> entry : balanceSheet.get(user).entrySet()) {
                if (entry.getValue() > 0) {
                    System.out.println(user + " owes " + entry.getKey() + ": ₹" + entry.getValue());
                }
            }
        }
    }

}
