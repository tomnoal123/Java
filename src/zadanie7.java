import java.awt.*;

public class zadanie7 {
    public static void main(String[] args) {
        int production = 4600000;
        double mazovicRegion = 0.62;
        double sell = production * mazovicRegion;
        System.out.println("Region mazowiecki wygenreuje sprzedaż: " + sell + " zł");
    }
}
