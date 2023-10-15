public class Product {

    private String nazivProzivoda;
    private String  barkod;
    private double osnovnaCena;
    private final double PDV = 0.20;
    public Product(String nazivProzivoda, String barkod, double osnovnaCena) {
        this.nazivProzivoda = nazivProzivoda;
        this.barkod = barkod;
        this.osnovnaCena = osnovnaCena;
    }


    public double cena(){
        return osnovnaCena * (1 + PDV);
    }
    @Override
    public String toString() {
        return "Naziv proizvoda:" + nazivProzivoda +
                " Barkod: " + barkod
                + " Osnovna cena: " + osnovnaCena +
                " PDV: " + PDV;
    }
}
