// Use instances of DecimalFormat to perform the same conversions in the table of previous exercise

import java.text.DecimalFormat;

public class Exercise10 {
    public static void main(String[] args) {
//        DecimalFormat df = new DecimalFormat();

        System.out.println(new DecimalFormat("$#,###.##").format(123456.783)); // $123.456,78
        System.out.println(new DecimalFormat("#,###.###;(#)").format(-9876.32532)); // (9,876.325)
        System.out.println(new DecimalFormat("#.######E00f").format(23.19283928394829182)); // 2.319284e+01f
        System.out.println(new DecimalFormat("0000000000").format(123456)); // 0000123456
        System.out.println(new DecimalFormat("#,###.#;-").format(-9876.35532)); // -9,876.4
    }
}
