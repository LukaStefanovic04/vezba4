public class Chocolate extends Product {
    public double tezina;

    public Chocolate(String nazivProzivoda, String barkod, double osnovnaCena, double tezina) {
        super(nazivProzivoda, barkod, osnovnaCena);
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return super.toString() + " Tezina cokolade " + tezina + "g";
    }
}
