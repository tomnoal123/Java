import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double productValue;
        System.out.println("Podaj wartość produktu: ");
        productValue = data.nextDouble();
        data.nextLine();
        double synapseTax = 0.04;
        double localTax = 0.02;
        double sell = productValue + (productValue * synapseTax) + (productValue * localTax);
        System.out.println("Wartość produktu: " + productValue + " podatek stanowy: " + synapseTax + " podatek lokalny: " + localTax + "\nŁączna kwota sprzedaży: \n" + sell);
    }
}
