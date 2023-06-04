class Call {
    int a, b;

    Call(int A, int B) {
        a = A;
        b = B;
    }

    void methValue(int i, int j) {
        i *= 2;
        j /= 2;
        System.out.println("DURING FUNCTION CALLING: " + i + " " + j);
    }

    void mathRef(Call obj2) {
        obj2.a = obj2.a * 2;
        obj2.b = obj2.b / 2;
        System.out.println("DURING FUNCTION CALLING: " + obj2.a + " " + obj2.b);
    }

    void displayRef() {
        System.out.println(a + " " + b);
    }
}

public class Calling {
    public static void main(String args[]) {
        Call obj = new Call(20, 30);
        Call obj2 = new Call(20, 30);
        int a = 20, b = 30;

        System.out.println("BEFORE CALLING BY VALUE: " + a + " " + b);
        obj.methValue(a, b);
        System.out.println("AFTER CALLING BY VALUE: " + a + " " + b);

        System.out.println("\n\nBEFORE CALLING BY REFERENCE: " + obj2.a + " " + obj2.b);
        obj2.mathRef(obj2);
        System.out.print("AFTER CALLING BY REFERENCE: ");
        obj2.displayRef();
    }
}