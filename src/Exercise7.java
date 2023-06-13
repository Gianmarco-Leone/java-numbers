// Write a function that takes a String input of “$12,345.83” and prints out that value divided
// by 32.19. It should return $383.53.

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Exercise7 {
    public static String calculate(String formattedMoney) throws ParseException {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
        Number value = formatter.parse(formattedMoney);
        BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);
        return formatter.format(result);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(calculate("$12,345.83"));
    }
}
