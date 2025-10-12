package problem02;

public class Main {
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Fruit f = new Edible.Fruit();
        f.fruitPackaging();

        Edible.Vegetable.vegetableDetails();
        Edible.Vegetable v = new Edible.Vegetable();
        v.vegetablePackaging();
    }
}
