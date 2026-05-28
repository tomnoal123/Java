import java.util.Scanner;
public class zadanie21 {
    public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
        System.out.println("Wpisz kwotę: ");
        double sum = data.nextInt();
        data.nextLine();
        System.out.println("Wpisz stopę oprocentowania: ");
        double procetage = data.nextDouble() * 0.01;
        data.nextLine();
        System.out.println("Ile razy w roku odsetki są doliczane do kapitału: ");
        double number = data.nextInt();
        data.nextLine();
        System.out.println("Podaj liczbę lat");
        double numberOfYear = data.nextInt();
        data.nextLine();
        double x = (1 + (procetage / number));
        double y = number * numberOfYear;
        double Price = Math.pow(x, y);
        double finalPrice = sum * Price;
        System.out.println("Finalna kwota: " + finalPrice + "zł");

    }
}

