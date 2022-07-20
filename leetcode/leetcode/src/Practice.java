import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {
        String name = "dog";
        int age = 21;
        String voice = "왈왈";

        Animal dog = new Animal(name, age, voice);
        Animal cat = new Animal("cat", 15, "냥냥");

        printAnimal(dog);
        printAnimal(cat);


    }
    static void printAnimal(Animal type){
        System.out.println("name = " + type.name);
        System.out.println("age = " + type.age);
        System.out.println("voice = " + type.voice);
    }
}

class Animal {
    String name;
    int age;
    String voice;

    public Animal(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }
}