package SplitWise;

import SplitWise.model.SplitType;
import SplitWise.model.Transaction;
import SplitWise.model.User;
import SplitWise.service.SplitService;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        User u1 = new User("U1", "Alice", "@gmail");
        User u2 = new User("U2", "Bob", "@gamail");
        User u3 = new User("U3", "Charlie", "@gmnail");

        SplitService service = new SplitService();

        // Equal Split: Alice paid ₹300 for Alice, Bob, Charlie
        Transaction tx1 = new Transaction(
                u1.getId(),
                300.0,
                List.of(u1.getId(), u2.getId(), u3.getId()),
                SplitType.EQUAL,
                null
        );
        service.addTransaction(tx1);

        // Unequal Split: Bob paid ₹120 for Alice (1 share), Bob (1), Charlie (2)
        Transaction tx2 = new Transaction(
                u2.getId(),
                120.0,
                List.of(u1.getId(), u2.getId(), u3.getId()),
                SplitType.UNEQUAL,
                List.of(1, 1, 2)
        );
        service.addTransaction(tx2);

        service.showBalances();
    }
}
