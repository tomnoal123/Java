import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double kilometers;
        System.out.println("Podaj liczbę przejechanych kilometrów: ");
        kilometers = data.nextDouble();
        data.nextLine();
        double liters;
        System.out.println("Podaj liczbę zużytych litrow paliwa: ");
        liters = data.nextDouble();
        data.nextLine();
        double result = kilometers / liters;
        System.out.println("Przejechaleś tyle na jednym litrze paliwa " + result);
    }
}
