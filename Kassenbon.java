public class Kassenbon {
    private static String welcome() {
        return "Sehr geehrter Kunde, hier ist Ihr Kassenbon.";
    }
    private static int round2Scale(double preis) {
        int round2Scale = (int) (preis * 100) % 100;
        return round2Scale;
    }
    private static void ausgabeWarenUndPreise(Waren[] warens) {
        for (int i = 0; i < warens.length; i++) {
            System.out.println(warens[i].getAnzahlWare() + " x " + warens[i].getNameWare() + " für " + warens[i].getPreisWare() + " EUR.");
        }
    }
    private static double getGesamtPreis(Waren[] waren) {
        double gesamt = 0;
        for (int i = 0; i < waren.length; i++) {
            for (int j = 0; j < waren[i].getAnzahlWare(); j++)
                gesamt = gesamt + waren[i].getPreisWare();
        }
        return gesamt;
    }
    private static void ausgabeGesamt(Waren[] warens) {
        System.out.println("Gesamtpreis " + getGesamtPreis(warens) + " EUR.");
    }
    private static void getGegeben(Geldbeutel geldbeutel) {
        System.out.println("Gegeben: " + geldbeutel.getInhaltGeldbeutel() + " EUR.");
    }
    public static void main(String[] args) {
        Waren ware1 = new Waren("Wurst", 1, 4.2);
        Waren ware2 = new Waren("Käse", 1, 2.3);
        Waren ware3 = new Waren("Brot", 1, 2.1);
        Waren ware4 = new Waren("DVD", 2, 24);
        System.out.println("Sehr geehrter Kunde, hier ist Ihr Kassenbon:");
        Waren[] waren = new Waren[]{
                ware1, ware2, ware3, ware4};
        ausgabeWarenUndPreise(waren);
        ausgabeGesamt(waren);
        System.out.println("Vielen Dank für Ihren Einkauf!");
        System.out.println("Bis zum Nächsten Mal!");
        Geldbeutel geldbeutel1 = new Geldbeutel(60);
        getGegeben(geldbeutel1);
    }
}