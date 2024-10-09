import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("How much dollars do you want to convert?");
        Scanner scan = new Scanner(System.in);
        int dollars = scan.nextInt();
        int vnd = dollars * 23000;
        System.out.println(vnd + " VND");
    }
}
