package ParkingLot;

import ParkingLot.vehicletype.Vehicle;

import java.util.Date;

public class Ticket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final long entryTimestamp;

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public long getEntryTimestamp() {
        return entryTimestamp;
    }

    public long getExitTimestamp() {
        return exitTimestamp;
    }

    private long exitTimestamp;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTimestamp = new Date().getTime();
    }

    public void setExitTimestamp() {
        this.exitTimestamp = exitTimestamp;
    }
}
