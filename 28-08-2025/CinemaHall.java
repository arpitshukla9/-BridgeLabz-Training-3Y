public class CinemaHall {
    boolean[][] seats = new boolean[5][10];

    public boolean bookSeats(int row, int numSeats) {
        if (row < 0 || row >= seats.length) {
            System.out.println("Invalid row.");
            return false;
        }
        for (int i = 0; i <= seats[row].length - numSeats; i++) {
            boolean available = true;
            for (int j = 0; j < numSeats; j++) {
                if (seats[row][i + j]) {
                    available = false;
                    break;
                }
            }
            if (available) {
                for (int j = 0; j < numSeats; j++) {
                    seats[row][i + j] = true;
                }
                System.out.println("Seats booked successfully.");
                return true;
            }
        }
        System.out.println("Not available.");
        return false;
    }

    public static void main(String[] args) {
        CinemaHall hall = new CinemaHall();
        hall.bookSeats(2, 3); 
        hall.bookSeats(2, 3); 
        hall.bookSeats(4, 5); 
        hall.bookSeats(5, 2); 
    }
}
