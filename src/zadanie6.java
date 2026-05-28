public class zadanie6 {

        public static void main(String[] args) {
            int roomSpace1 = 3 * 4;
            int roomSpace2 = 3 * 4;
            int roomSpace3 = 2 * 3;
            int roomSpace4 = 2 * 2;

            double allSpace = roomSpace1 + roomSpace2 + roomSpace3 + roomSpace4;
            double onePerson = (allSpace / 4);
            System.out.println("Powierzchnia przypadająca na 1 osobę to: " + onePerson);

        }
}
