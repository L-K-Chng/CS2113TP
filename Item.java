public class Item {
    String name;
    Double price;

    public void item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void item() {
        this.name = "no name";
        this.price = -1.0;
    }
}