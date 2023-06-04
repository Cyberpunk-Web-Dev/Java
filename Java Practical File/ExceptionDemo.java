import java.util.Scanner;

public class ExceptionDemo0 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numerator, denominator, result;
    
    try {
      System.out.print("Enter numerator: ");
      numerator = scanner.nextInt();
      
      System.out.print("Enter denominator: ");
      denominator = scanner.nextInt();
      
      result = numerator / denominator;
      
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      scanner.close();
      System.out.println("End of program.");
    }
  }
}

