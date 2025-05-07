package SplitWise.startegy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnequalSplitStrategy implements SplitStrategy {

    @Override
    public Map<String, Double> calculateSplits(double amount, List<String> users, List<Integer> shares) {
        Map<String, Double> splitMap = new HashMap<>();
        int totalShares = shares.stream().mapToInt(Integer::intValue).sum();
        for (int i = 0; i < users.size(); i++) {
            double userShare = Math.round((amount * shares.get(i) / totalShares) * 100.0) / 100.0;
            splitMap.put(users.get(i), userShare);
        }
        return splitMap;
    }
}
