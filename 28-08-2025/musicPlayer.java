import java.util.*;
public class musicPlayer {
    public static void main(String[] args) {
        String[] songs = {"Tere Bina", "Tum Hi Ho", "Sun Saathiya"};
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Music Playlist Manager");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Playing all songs:");
                    for (String song : songs) {
                        System.out.println(" - " + song);
                    }
                    break;
                case 2:
                    System.out.print("Enter song index (0-" + (songs.length - 1) + "): ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < songs.length) {
                        System.out.println("Playing: " + songs[index]);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter song name to search: ");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }   
}
