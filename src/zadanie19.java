public class zadanie19 {
    public static void main(String[] args) {
        int cosuments = 12467;
        double oneEnergyDrinkByWeek = cosuments * 0.14;
        double citrusFlavor = cosuments * 0.64;
        int citrus = (int)citrusFlavor;
        int week = (int)oneEnergyDrinkByWeek;
        System.out.println("Liczba osób ankietowanych, którzy kupują: " + week + "\nLiczba ankietowanych osób, którzy kupują najpój energetyczny o smaku cytrusowym: " + citrus);
    }
}
