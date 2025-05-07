package SplitWise.startegy;

import java.util.List;
import java.util.Map;

public interface SplitStrategy {
    Map<String, Double> calculateSplits(double amount, List<String> users, List<Integer> shares);
}