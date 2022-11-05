import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Guest Adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13) );
        Guest Jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println("Hosté informace: ");
        System.out.println(Adela.getName());
        System.out.println(Adela.getSurname());
        System.out.println(Adela.getBorn());

        System.out.println(Jan.getName());
        System.out.println(Jan.getSurname());
        System.out.println(Jan.getBorn());

        Room number_1 = new Room(1,1,1000,true, true);
        Room number_2 = new Room(2,1,1000, true, true);
        Room number_3 = new Room(3,3, 2400, false, true);

        System.out.println("Pokoje infromace: ");
        //boolean to String
        String balcony1=String.valueOf(number_1.haveBalcony);
        String sea1=String.valueOf(number_1.seaView);
        String balcony2=String.valueOf(number_2.haveBalcony);
        String sea2=String.valueOf(number_2.seaView);
        ;String balcony3=String.valueOf(number_3.haveBalcony);
        String sea3=String.valueOf(number_3.seaView);

        System.out.println("Pokoj č. 1 ");
        System.out.println(number_1.getRoomNumber());
        System.out.println(number_1.getNumberOfbeds());
        System.out.println(number_1.getRoomCost());
        System.out.println(balcony1);
        System.out.println(sea1);

        System.out.println("Pokoj č. 2 ");
        System.out.println(number_2.getRoomNumber());
        System.out.println(number_2.getNumberOfbeds());
        System.out.println(number_2.getRoomCost());
        System.out.println(balcony2);
        System.out.println(sea2);

        System.out.println("Pokoj č. 3 ");
        System.out.println(number_3.getRoomNumber());
        System.out.println(number_3.getNumberOfbeds());
        System.out.println(number_3.getRoomCost());
        System.out.println(balcony3);
        System.out.println(sea3);






        Booking adelaAlone = new Booking(LocalDate.of(2021,7, 19),LocalDate.of(2021, 7, 26),false, true, 1 );
        Booking adelaAndjan = new Booking(LocalDate.of(2021, 9, 14), LocalDate.of(2021, 9, 14),false, true, 3);

        ArrayList<Booking> bookings = new ArrayList<>();
        bookings.add(adelaAlone);
        bookings.add(adelaAndjan);

        System.out.println("seznam rezervací:");

            System.out.println("rezervace Adéla");
            System.out.println(adelaAlone.getRoomNumberbooking());
            System.out.println(adelaAlone.getStartOfreservation());
            System.out.println(adelaAlone.getEndOfreservation());

            System.out.println("rezervace Jan a Adéla");
            System.out.println(adelaAndjan.getRoomNumberbooking());
            System.out.println(adelaAndjan.getStartOfreservation());
            System.out.println(adelaAndjan.getEndOfreservation());
















    }
    }