public class zadanie22 {
    public static void main(String[] args) {
        int actions = 1000;
        double priceByOneAcion = 32.87;
        double x = actions * priceByOneAcion;
        double provison = x * 0.02;
        double finalPrice = provison + x;
        double newPriceByOneAction = 33.92;
        double y = actions * newPriceByOneAction;
        double newProvision = y * 0.02;
        double newFinalPrice = y - newProvision;
        double profit = newFinalPrice - finalPrice;
        System.out.println("Kwota zapłacona przez pana Jacka za akcje: " + x + "\nWartość prowizji zapłacona przez pana Jacka brokerwoi:" + provison + "\nSprzedaż akcji: " + y + "\nWartość prowizji przy sprzedaży: " + newProvision + "\nZysk: " + profit);
    }
}
