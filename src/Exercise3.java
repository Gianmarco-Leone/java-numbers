// Using only what you’ve learned so far in this course, create a class that contains 10
// lowercase names and has a method that can be called 10 separate times, each time,
// returning the next name. If the method is called “next()”, the first time it’s called, it returns
// “name1”, the second time “next()” is called, it returns “name2”, etc.
//      1. Make the next() method capitalize the first letter of each name as it outputs them.

public class Exercise3 {
    private String[] people = {"bob", "larry", "sammy", "johnny", "rohith", "sally", "susan", "betty", "jane", "samantha"};
    private int currentPersonIndex = 0;

    public String next() {
        String currentPerson = people[currentPersonIndex++];
//        Bonus 1
        return currentPerson.substring(0,1).toUpperCase() + currentPerson.substring(1);
    }

    public static void main(String[] args) {
        Exercise3 ex3 = new Exercise3();
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
        System.out.println(ex3.next());
    }
}
