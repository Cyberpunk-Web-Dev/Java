public class StrMethods {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";

        if (str.equals("Hello, World!")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        String trimmedStr = str.trim();
        System.out.println("Trimmed string: " + trimmedStr);

        int strLength = str.length();
        System.out.println("Length of string: " + strLength);
        String subStr = str.substring(7, 13);
        System.out.println("Substring: " + subStr);
        String str1 = "apple";
        String str2 = "banana";
        int compareResult = str1.compareTo(str2);
        System.out.println("Result of lexicographical comparison: " + compareResult);
    }
}
