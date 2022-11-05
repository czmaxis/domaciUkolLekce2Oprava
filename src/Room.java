

public class Room {
int roomNumber;
int numberOfbeds;
int roomCost;
boolean haveBalcony;
boolean seaView;


public Room(int roomNumber, int numberOfbeds, int roomCost, boolean haveBalcony, boolean seaView) {
    this.roomNumber = roomNumber;
    this.numberOfbeds = numberOfbeds;
    this.roomCost = roomCost;
    this.haveBalcony = haveBalcony;
    this.seaView = seaView;
}

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfbeds() {
        return numberOfbeds;
    }

    public void setNumberOfbeds(int numberOfbeds) {
        this.numberOfbeds = numberOfbeds;
    }

    public int getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(int roomCost) {
        this.roomCost = roomCost;
    }

    public boolean isHaveBalcony() {
        return haveBalcony;
    }

    public void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }
}
