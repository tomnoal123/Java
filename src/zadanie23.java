import java.util.Scanner;
public class zadanie23 {
    public static void main(String[] args) {
          Scanner data = new Scanner(System.in);
        System.out.println("Podaj liczbę szadzonek: ");
        int amountOf = data.nextInt();
        data.nextLine();
        System.out.println("Podaj długość rzędu w metrach");
        int width = data.nextInt();
        data.nextLine();
        System.out.println("Odległośc między szadzonek w metrach");
        int odlegosc = data.nextInt();
        data.nextLine();
        double V = (width - (2 * amountOf) / odlegosc);
        int newV = (int)V;
        System.out.println(V);

    }
}
