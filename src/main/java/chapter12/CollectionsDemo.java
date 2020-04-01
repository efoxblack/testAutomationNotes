package chapter12;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // setDemo();
        // listDemo();
        // queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet(); // duplicate elements do not get added to set
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.size()); // 4
//        System.out.println(fruit); // [banana, orange, apple, lemon]

        var i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item : fruit) {
            System.out.println(item);
        }

        fruit.forEach(System.out::println);
    }

    public static void listDemo() {
        List fruit2 = new ArrayList(); // duplicate elements can get added to list
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");

        System.out.println(fruit2.get(2)); // banana
        System.out.println(fruit2.size()); // 5
        System.out.println(fruit2); // [apple, lemon, banana, orange, lemon]
    }

    public static void queueDemo() {
        Queue fruit3 = new LinkedList(); // duplicate elements can get added to queue
        fruit3.add("apple");
        fruit3.add("lemon");
        fruit3.add("banana");
        fruit3.add("orange");
        fruit3.add("lemon");

        System.out.println(fruit3.size()); // 5
        System.out.println(fruit3); // [apple, lemon, banana, orange, lemon]

        fruit3.remove();
        System.out.println(fruit3); // [lemon, banana, orange, lemon]
        System.out.println(fruit3.peek()); // lemon
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap(); // duplicate map keys write over the first map key's value
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

//        System.out.println(fruitCalories.size()); // 4
//        System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17}
//
//        System.out.println(fruitCalories.get("lemon")); // 17
//
//        System.out.println(fruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories); // {banana=105, apple=95, lemon=17 }

//        for(var entry: fruitCalories.entrySet()) {
//            System.out.println(entry.getValue());
//        }

        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
