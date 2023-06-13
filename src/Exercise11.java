// Write a method that takes the String inputs, “37” & “13”, and returns an integer of their
// sum, 50.

public class Exercise11 {
    public static int sumBetweenString(String string1, String string2) {
        Integer num1 = Integer.parseInt(string1);
        Integer num2 = Integer.parseInt(string2);
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumBetweenString("37", "13"));
    }
}
