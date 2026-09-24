import java.util.Scanner;
import java.text.MessageFormat;

public class Lab3_Vadim_Kolganenko_KN_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double decimal = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        String text = scanner.next();

        System.out.print("Введіть логічне значення (true або false): ");
        boolean logic = scanner.nextBoolean();


        // 1. System.out.println()
        System.out.println(number + " " + decimal + " " + text + " " + logic);


        // 2. MessageFormat.format()
        System.out.println(MessageFormat.format(
                "Ціле: {0}, дробове: {1}, строка: {2}, логічне: {3}",
                number, decimal, text, logic));


        // 3. MessageFormat.format() - ціле число
        System.out.println(MessageFormat.format(
                "Ціле число: {0,number,integer}, дробове: {1}, строка: {2}, логічне: {3}",
                number, decimal, text, logic));


        // 4. MessageFormat.format() - відсоток
        System.out.println(MessageFormat.format(
                "Ціле: {0}, відсоток: {1,number,percent}, строка: {2}, логічне: {3}",
                number, decimal, text, logic));


        // 5. System.out.format() - десяткова система
        System.out.format(
                "Ціле: %d, дробове: %f, строка: %s, логічне: %b%n",
                number, decimal, text, logic);


        // 6. System.out.format() - шістнадцяткова система
        System.out.format(
                "Ціле (16): %x, дробове: %f, строка: %s, логічне: %b%n",
                number, decimal, text, logic);


        // 7. System.out.format() - вісімкова система
        System.out.format(
                "Ціле (8): %o, дробове: %f, строка: %s, логічне: %b%n",
                number, decimal, text, logic);


        // 8. System.out.format() - кількість знаків після крапки
        System.out.format(
                "Ціле: %d, дробове: %.2f, строка: %s, логічне: %b%n",
                number, decimal, text, logic);


        // 9. System.out.format() - ширина поля та вирівнювання
        System.out.format(
                "Ціле: %d, дробове: %f, строка: %10s, логічне: %b%n",
                number, decimal, text, logic);


        // 10. System.out.format() - ширина поля та довжина строки
        System.out.format(
                "Ціле: %d, дробове: %f, строка: %10.5s, логічне: %b%n",
                number, decimal, text, logic);

        scanner.close();
    }
}