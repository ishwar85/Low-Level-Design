package SplitWise.startegy;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public Map<String, Double> calculateSplits(double amount, List<String> users, List<Integer> shares) {
        Map<String, Double> splitMap = new HashMap<>();
        double perHead = Math.round((amount / users.size()) * 100.0) / 100.0;
        for (String user : users) {
            splitMap.put(user, perHead);
        }
        return splitMap;
    }
}
