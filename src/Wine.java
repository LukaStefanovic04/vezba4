public class Wine extends Product{
    private  double zapreminaBoce;
    private final double dodatniPorez = 0.10;

    public Wine(String nazivProzivoda, String barkod, double osnovnaCena, double zapreminaBoce) {
        super(nazivProzivoda, barkod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;
    }

    @Override
    public double cena(){
        super.cena();
        return super.cena() * (1 + dodatniPorez);
    }

    @Override
    public String toString() {
        return super.toString() + " Zapremina boce " + zapreminaBoce + "l";
    }
}
