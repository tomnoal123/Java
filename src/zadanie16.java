import java.util.Scanner;
public class zadanie16 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta: ");
        String cityName = data.nextLine();
        int citySyntaxLength = cityName.length();
        String cityUpperCase, cityLowerCase;
         cityUpperCase = cityName.toUpperCase();
         cityLowerCase = cityName.toLowerCase();
         char firstSynax = cityName.charAt(0);
        System.out.println(citySyntaxLength+ " " + cityLowerCase + " " + cityUpperCase + " " + firstSynax);
    }
}
