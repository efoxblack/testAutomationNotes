package chapter10.chap10exercise;

public class Apple extends Fruit{

    public Apple (int calories) {
        super(calories);
    }

    public void removeSeeds() {
        System.out.println("The seeds have been removed from the apple.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }
}
