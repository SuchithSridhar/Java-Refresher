import java.text.NumberFormat;
public class OutputFormatting{
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumIntegerDigits(2);
        number.setMinimumFractionDigits(2);
        number.setMaximumFractionDigits(2);

        System.out.println(currency.format(12.3455));
        System.out.println(number.format(1.2));
        System.out.println(number.format(123.1234));

    }
}
