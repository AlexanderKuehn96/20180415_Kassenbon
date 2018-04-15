import java.util.Scanner;
public class Waren {
    private String nameWare;
    private int anzahlWare;
    private double preisWare;
    Scanner scanner = new Scanner(System.in);
    /* public String setNameWare() {
        System.out.println("Name der Ware");
        String nameWare = scanner.nextLine();
        return nameWare;
    }
    private int setPreisWare() {
        System.out.println("Preis der Ware");
        int preisWare = Integer.parseInt(scanner.nextLine());
        return preisWare;
    }
    public String setPreisWareToString() {
        String preisString = setPreisWare() + ".00 €";
        return preisString;
    } */
    public double getPreisWare() {
        return preisWare;
    }
    public String getNameWare() {
        return nameWare;
    }
    public int getAnzahlWare() {
        return anzahlWare;
    }
    public Waren(String nameWare, int anzahlWare, double preisWare) {
        this.nameWare = nameWare;
        this.anzahlWare = anzahlWare;
        this.preisWare = preisWare;
    }
}
