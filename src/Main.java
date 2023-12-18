

public class Main {
    public static void main(String[] args) {
        HotelReservationSystem reservationSystem = new HotelReservationSystem();

        reservationSystem.reserveRoom(101, "John Doe");
        reservationSystem.reserveRoom(203, "Jane Smith");
        reservationSystem.reserveRoom(150, "Alice Johnson");

        int searchRoomNumber = 203;
        if (reservationSystem.searchReservation(searchRoomNumber)) {
            System.out.println("Reservation for Room " + searchRoomNumber + " found.");
        } else {
            System.out.println("No reservation found for Room " + searchRoomNumber + ".");
        }

        System.out.println("All Reservations:");
        reservationSystem.displayReservations();
    }
}


