import java.math.BigDecimal;
public class Main {
    /**
     // Humans work in Base 10 and Floating point numbers work in Base 2.
     //Many times it is not possible to transform numbers between this two number systems
     * and in this program the if(d != 1.0) is not true because the system keeps on adding decimals
     * and d will never be equal to 1.0  so the system will not print "d is 1"
     *
     * To solve This through research i found that Java has Math class called BigDecimal that
     * for this cases when working with floats and to transform base 10 and binary numbers its more precise.
     */

    public static void main(String [] args) {
        BigDecimal d = new BigDecimal(0.0);
        BigDecimal max = new BigDecimal(1.0);

        while (d.equals(max)) {
            BigDecimal add = new BigDecimal(0.1);
            d = d.add(add);

        }

        System.out.println("d is 1");
    }
}
