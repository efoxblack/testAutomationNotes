package chapter10.chap10exercise;

public class Market {
    public static void main(String[] args) {

        Fruit fruit = new Fruit(0);
        fruit.makeJuice();

        Fruit apple = new Apple(95);
        apple.makeJuice();
        ((Apple) apple).removeSeeds();

        Fruit banana = new Banana(105);
        banana.makeJuice();
        ((Banana) banana).peel();
    }
}
