// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Najlepse zelje :)", "123456", 2.99, 100);
        Wine wine = new Wine("Zdrepceva krv", "789012", 15.99, 0.75);

        System.out.println("Informacije: " + chocolate.toString());
        System.out.println("Cena: " + chocolate.cena());

        System.out.println("Informacije: " + wine.toString());
        System.out.println("Cena: " + wine.cena());

    }
}