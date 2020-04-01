package chapter9.chap9exercise;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.getFlavor();

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.getCandles();

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.getTiers();
    }
}
