import java.io.FilterOutputStream;
import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {

        Scanner userData = new Scanner(System.in);

        String firstName;

        System.out.println("Podaj swoje imię: ");

        firstName = userData.nextLine();

        String middleName;

        System.out.println("Podaj swoje drugie imię: ");

        middleName = userData.nextLine();

        String lastName;

        System.out.println("Podaj swoję nazwisko: ");

        lastName = userData.nextLine();

        char firstInitial = firstName.charAt(0);

        char middleInitial = middleName.charAt(0);

        char lastInitial = lastName.charAt(0);

        System.out.println("Nazywasz sie : " + firstName + " " + middleName + " " + lastName + " , a Twoje inicjały to: " + firstInitial + " " + middleInitial + " " + lastInitial);
    }
}
