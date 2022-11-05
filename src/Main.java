import java.time.LocalDate;
import java.util.ArrayList;
import java.math.BigDecimal;



public class Main {
    public static void main(String[] args) {
        Guest Adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13) );
        Guest Jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(Adela);
        guests.add(Jan);

        for (Guest guest : guests) {
       System.out.println("Celé jméno: "+ guest.getName()+" "+  guest.getSurname()+", "+"Datum narození: "+ guest.getBorn());
      // System.out.println("Příjmení "+ guest.getSurname());
       //System.out.println("Datum narození: "+ guest.getBorn());
        }

//        System.out.println("Hosté informace: ");
//        System.out.println(Adela.getName());
//        System.out.println(Adela.getSurname());
//        System.out.println(Adela.getBorn());
//
//        System.out.println(Jan.getName());
//        System.out.println(Jan.getSurname());
//        System.out.println(Jan.getBorn());

        Room roomNumber1 = new Room(1,1,BigDecimal.valueOf(1000),true, true);
        Room roomNumber2 = new Room(2,1,BigDecimal.valueOf(1000), true, true);
        Room roomNumber3 = new Room(3,3, BigDecimal.valueOf(2400), false, true);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(roomNumber1);
        rooms.add(roomNumber2);
        rooms.add(roomNumber3);




        System.out.println("Pokoje infromace: ");
//        //boolean to String
//        String balcony1=String.valueOf(roomNumber1.haveBalcony);
//        String sea1=String.valueOf(roomNumber1.seaView);
//        String balcony2=String.valueOf(roomNumber2.haveBalcony);
//        String sea2=String.valueOf(roomNumber2.seaView);
//        ;String balcony3=String.valueOf(roomNumber3.haveBalcony);
//        String sea3=String.valueOf(roomNumber3.seaView);

        for (Room room : rooms) {
            System.out.println("číslo pokoje "+ room.getRoomNumber()+", počet lůžek "+ room.getNumberOfbeds()+", cena pokoje za 1 noc "+room.getRoomCost()+", výhled na moře "+ room.seaView+", pokoj s balkónem "+ room.haveBalcony);
//            System.out.println("počet lůžek "+ room.getNumberOfbeds());
//            System.out.println("cena pokoje za 1 noc "+room.getRoomCost());
//            System.out.println("výhled na moře "+ room.seaView);
//            System.out.println("pokoj s balkónem "+ room.haveBalcony);

        }


        //        System.out.println("Pokoj č. 1 ");
//        System.out.println(roomNumber1.getRoomNumber());
//        System.out.println(roomNumber1.getNumberOfbeds());
//        System.out.println(roomNumber1.getRoomCost());
//        System.out.println(balcony1);
//        System.out.println(sea1);
//
//        System.out.println("Pokoj č. 2 ");
//        System.out.println(roomNumber2.getRoomNumber());
//        System.out.println(roomNumber2.getNumberOfbeds());
//        System.out.println(roomNumber2.getRoomCost());
//        System.out.println(balcony2);
//        System.out.println(sea2);
//
//        System.out.println("Pokoj č. 3 ");
//        System.out.println(roomNumber3.getRoomNumber());
//        System.out.println(roomNumber3.getNumberOfbeds());
//        System.out.println(roomNumber3.getRoomCost());
//        System.out.println(balcony3);
//        System.out.println(sea3);






        Booking adelaAlone = new Booking(LocalDate.of(2021,7, 19),LocalDate.of(2021, 7, 26),false, true, roomNumber1 );
        Booking adelaAndJan = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14),false, true, roomNumber3);

        ArrayList<Booking> bookings = new ArrayList<>();
        bookings.add(adelaAlone);
        bookings.add(adelaAndJan);

        System.out.println("seznam rezervací:");

        for (Booking booking: bookings) {
            System.out.println("pokoj č. "+ booking.getRoom().getRoomNumber()+", od "+ booking.getStartOfreservation()+" do "+ booking.getEndOfreservation());
//            System.out.println("od "+ booking.getStartOfreservation());
//            System.out.println("do "+ booking.getEndOfreservation());

        }

//            System.out.println("rezervace Adéla");
//            System.out.println(adelaAlone.getRoom());
//            System.out.println(adelaAlone.getStartOfreservation());
//            System.out.println(adelaAlone.getEndOfreservation());
//
//            System.out.println("rezervace Jan a Adéla");
//            System.out.println(adelaAndJan.getRoom());
//            System.out.println(adelaAndJan.getStartOfreservation());
//            System.out.println(adelaAndJan.getEndOfreservation());
















    }
    }