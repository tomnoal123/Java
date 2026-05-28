import java.util.Scanner;
public class zadanie15 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Podaj cenę detaliczną płytki: ");
        double detalicPrice;
        detalicPrice = data.nextDouble();
        data.nextLine();
        double profit = detalicPrice * 0.4;
        System.out.println("Zysk: " + profit);
    }
}
