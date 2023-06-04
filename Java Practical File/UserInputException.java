import java.util.Scanner;
class NoMatchException extends Exception {
    public NoMatchException() {
        super("String does not match 'india'");
    }
}

public class UserInputException  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try {
            if (!input.equals("india")) {
                throw new NoMatchException();
            }
            System.out.println("String matches 'india'");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
