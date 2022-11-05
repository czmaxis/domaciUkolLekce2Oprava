import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
int roomNumberbooking;
LocalDate startOfreservation;
LocalDate endOfreservation;
boolean workStay;
boolean holidayStay;

ArrayList<Booking> bookings = new ArrayList<>();


    public Booking(LocalDate startOfreservation, LocalDate endOfreservation, boolean workStay, boolean holidayStay, int roomNumberbooking ){
        this.roomNumberbooking = roomNumberbooking;
        this.startOfreservation = startOfreservation;
    this.endOfreservation = endOfreservation;
    this.workStay = workStay;
    this.holidayStay = holidayStay;
}

    public int getRoomNumberbooking() {
        return roomNumberbooking;
    }

    public void setRoomNumberbooking(int roomNumberbooking) {
        this.roomNumberbooking = roomNumberbooking;
    }

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
