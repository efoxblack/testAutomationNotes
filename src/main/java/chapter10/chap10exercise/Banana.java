package chapter10.chap10exercise;

public class Banana extends Fruit {

    public Banana (int calories) {
        super(calories);
    }

    public void peel() {
        System.out.println("The banana peel is slowly removed as you eat it.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice(?) is made.");
    }
}
