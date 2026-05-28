import java.util.Scanner;
public class zadanie14 {
    public static void main(String[] args) {

        Scanner testData = new Scanner(System.in);



        System.out.println("Wprowadź wynik z pierwszego testu: ");
        double firstTest;

        firstTest = testData.nextDouble();

        testData.nextLine();


        System.out.println("Wprowadź wynik z drugiego testu: ");
        double secondTest;
        secondTest = testData.nextDouble();

        testData.nextLine();



        System.out.println("Wprowadź wynik z trzeciego testu: ");
        double thirdTest;
        thirdTest = testData.nextDouble();

        testData.nextLine();

        double averge = (firstTest + secondTest + thirdTest) / 3;

        System.out.println("Średnia z testów : " + averge);
    }
}
