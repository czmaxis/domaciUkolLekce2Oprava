import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
    Room room;
    Guest guest;
//private int roomNumberbooking;
private LocalDate startOfreservation;
private LocalDate endOfreservation;
private boolean workStay;
private boolean holidayStay;

ArrayList<Booking> bookings = new ArrayList<>();


    public Booking(LocalDate startOfreservation, LocalDate endOfreservation, boolean workStay, boolean holidayStay, Room room ){
        this.room = room;
        this.startOfreservation = startOfreservation;
    this.endOfreservation = endOfreservation;
    this.workStay = workStay;
    this.holidayStay = holidayStay;
}

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

//    public void setRoomNumberbooking(int roomNumberbooking) {
//        this.roomNumberbooking = roomNumberbooking;
//    }

    public LocalDate getStartOfreservation() {
        return startOfreservation;
    }

    public void setStartOfreservation(LocalDate startOfreservation) {
        this.startOfreservation = startOfreservation;
    }

    public LocalDate getEndOfreservation() {
        return endOfreservation;
    }

    public void setEndOfreservation(LocalDate endOfreservation) {
        this.endOfreservation = endOfreservation;
    }

    public boolean isWorkStay() {
        return workStay;
    }

    public void setWorkStay(boolean workStay) {
        this.workStay = workStay;
    }

    public boolean isHolidayStay() {
        return holidayStay;
    }

    public void setHolidayStay(boolean holidayStay) {
        this.holidayStay = holidayStay;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
