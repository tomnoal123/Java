public class zadanie5 {
    public static void main(String[] args) {
        int roomSpace1 = 3 * 4;
        int roomSpace2 = 3 * 4;
        int roomSpace3 = 2 * 3;
        int roomSpace4 = 2 * 2;

        int allSpace = roomSpace1 + roomSpace2 + roomSpace3 + roomSpace4;

        System.out.println("Pomieszczenie numer 1: " + roomSpace1 + " metrów kwadratowych");
        System.out.println("Pomieszczenie numer 2: " + roomSpace2 + " metrów kwadratowych");
        System.out.println("Pomieszczenie numer 3: " + roomSpace3 + " metrów kwadratowych");
        System.out.println("Pomieszczenie numer 4: " + roomSpace4 + " metrów kwadratowych");
        System.out.println("Całkowita powierzchnia mieszkania: " + allSpace + " metrów kwadratowych");
    }
}
