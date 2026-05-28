import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {
        Scanner calories = new Scanner(System.in);
        int cookie;
        System.out.println("Ile zjadleś ciastek: ");
        cookie = calories.nextInt();
        calories.nextLine();
        double yourCalories = cookie * (300 / 4);
        System.out.println("Zjadleś " + yourCalories + " kalorii");
    }
}
