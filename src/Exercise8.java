// Use printf() to format the following inputs to print out the following outputs
// INPUT: 123456.783  -  OUTPUT: $123,456.78
// INPUT: -9876.32532  -  OUTPUT: (9,876.325)
// INPUT: 23.19283928394829182  -  OUTPUT: 2.319284e+01f
// INPUT: 123456  -  OUTPUT: 0000123456
// INPUT: -9876.35532  -  OUTPUT: -9,876.4
public class Exercise8 {
    public static void main(String[] args) {
        System.out.printf("$%,.2f%n", 123456.783); // $123,456.78
        System.out.printf("%,(.3f%n", -9876.32532); // (9,876.325)
        System.out.printf("%ef%n", 23.19283928394829182); // 2.319284e+01f
        System.out.printf("%010d%n", 123456); // 0000123456 - uso d perchè è un int e non un float
        System.out.printf("%,.1f%n", -9876.35532); // -9,876.4
    }
}
