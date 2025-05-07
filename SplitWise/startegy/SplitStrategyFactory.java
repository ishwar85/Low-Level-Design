package SplitWise.startegy;

import SplitWise.model.SplitType;

public class SplitStrategyFactory {
    public static SplitStrategy getStrategy(SplitType type) {
        return switch (type) {
            case EQUAL -> new EqualSplitStrategy();
            case UNEQUAL -> new UnequalSplitStrategy();
        };
    }
}
