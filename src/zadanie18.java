public class zadanie18 {
    public static void main(String[] args) {
        int actions = 600;
        double priceByOneAction = 21.77;
        double provision = actions * priceByOneAction * 0.02;
        double actionWithoutProvison = actions * priceByOneAction;
        double finalPrice = provision + actionWithoutProvison;
        System.out.println("Kwota za samą akcje: " + actionWithoutProvison + "\nWysokość prowizji: " + provision + "\nŁączna kwota: " + finalPrice);
    }
}
