import java.util.Scanner;
import java.util.Vector;

public class FriendsList {
    public static void main(String[] args) {
        Vector<String> friends = new Vector<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of your friends (press enter to stop):");
        String name = scanner.nextLine();
        while (!name.isEmpty()) {
            friends.addElement(name);
            name = scanner.nextLine();
        }

        System.out.println("Your friends:");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println("- " + friends.elementAt(i));
        }

        System.out.println("Adding friend: David");
        friends.addElement("David");

        System.out.println("Removing friend: Alice");
        friends.removeElement("Alice");

        System.out.println("Size of friends list: " + friends.size());
    }
}
