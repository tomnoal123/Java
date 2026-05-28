import java.util.Scanner;
public class zadanie20 {
    public static void main(String[] args) {
        Scanner cookiesData = new Scanner(System.in);
        System.out.println("Podaj liczbę ciastek: ");
        int numberofCookies = cookiesData.nextInt();
        cookiesData.nextLine();
        int cookies = 48;
        double oneCupOfSugar = 1.5 / cookies;
        double oneCupOfButter = (double)1 / cookies;
        double oneCupOfFlour = 2.75 / cookies;
        double howMuchCupOfSugar = oneCupOfSugar * numberofCookies;
        double howMuchCupOfFlour = oneCupOfFlour * numberofCookies;
        double howMuchCupOfButter = oneCupOfButter * numberofCookies;
        System.out.println("Ilość kostek masła: " + howMuchCupOfButter + " Ilość szklanek mąki: " + howMuchCupOfFlour + " Ilość szklanek cukru: " + howMuchCupOfSugar);


    }
}
