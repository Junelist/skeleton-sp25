public class Dessert {
    int flavor;
    int price;

    static int numDesserts = 0;

    public Dessert(int f, int p) {
        flavor = f;
        price = p;
        Dessert.numDesserts++;
    }

    public void printDessert() {
        System.out.println(flavor + " " + price + " " + Dessert.numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
