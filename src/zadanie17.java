import java.util.Scanner;
public class zadanie17 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Wprowadź cenę posiłku: ");
        double price = data.nextDouble();
        data.nextLine();
        double tax = (0.675 * price) + price;
        double tip = tax * 0.2;
        double finalPrice = tax + tip;
        System.out.println("Cena produktu:" + price + "\nPodatek: " + tax + "\nWysokość napiwku: " + tip + "\n Łączna kwota: " + finalPrice);
    }
}
