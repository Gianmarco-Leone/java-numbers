// How could you format each of the inputs in the table of previous exercise and store them in String
// variables instead of just printing them out directly?

public class Exercise9 {
    public static void main(String[] args) {
        String numToString1 = String.format("$%,.2f%n", 123456.783);
        String numToString2 = String.format("%,(.3f%n", -9876.32532);
        String numToString3 = String.format("%ef%n", 23.19283928394829182);
        String numToString4 = String.format("%010d%n", 123456);
        String numToString5 = String.format("%,.1f%n", -9876.35532);

        System.out.println(numToString1);
        System.out.println(numToString2);
        System.out.println(numToString3);
        System.out.println(numToString4);
        System.out.println(numToString5);
    }
}
