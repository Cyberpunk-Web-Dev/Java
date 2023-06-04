public class CommandLineArguments {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        System.out.println("Command line arguments:");
        System.out.println(num1);
        System.out.println(num2);
        double Result = num1 *  num2;
        System.out.println("Result: " + Result);
    }
}
