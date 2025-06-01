package ParkingLot.vehicletype.fee;

import ParkingLot.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
