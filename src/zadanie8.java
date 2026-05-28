import java.util.Scanner;
public class zadanie8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int firstRoomWidth;

        System.out.println("Podaj szerokość pierwszego pokoju: ");

        firstRoomWidth = keyboard.nextInt();

        keyboard.nextLine();

        int firstRoomHeigth;

        System.out.println("Podaj długość pierwszego pokoju: ");

        firstRoomHeigth = keyboard.nextInt();

        keyboard.nextLine();

        int secondRoomWidth;

        System.out.println("Podaj szerokość drugiego pokoju: ");

        secondRoomWidth = keyboard.nextInt();

        keyboard.nextLine();

        int secondRoomHeigth;

        System.out.println("Podaj długość drugiego pokoju: ");

        secondRoomHeigth = keyboard.nextInt();

        keyboard.nextLine();

        int thirdRoomWidth;

        System.out.println("Podaj szerokość trzeciego pokoju: ");

        thirdRoomWidth = keyboard.nextInt();

        keyboard.nextLine();

        int thirdRoomHeigth;

        System.out.println("Podaj długość trzeciego pokoju: ");

        thirdRoomHeigth = keyboard.nextInt();

        keyboard.nextLine();

        int fourthRoomWidth;

        System.out.println("Podaj szerokość czwartego pokoju: ");

        fourthRoomWidth = keyboard.nextInt();

        keyboard.nextLine();

        int fourthRoomHeigth;

        System.out.println("Podaj długość czwartego pokoju: ");

        fourthRoomHeigth = keyboard.nextInt();

        keyboard.nextLine();

        int allSpace = (firstRoomHeigth * firstRoomWidth) + (secondRoomHeigth * secondRoomWidth) + (thirdRoomHeigth * thirdRoomWidth) + (fourthRoomHeigth * fourthRoomWidth);

        System.out.println("Całkowita powierzchnia mieszkania: " + allSpace + "m^2");

    }
}
