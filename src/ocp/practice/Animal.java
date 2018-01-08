package ocp.practice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliab on 08.08.2017.
 */
public class Animal implements Serializable {

    String name;
    Integer babies;

    public Animal(String name, Integer babies) {
        this.name = name;
        this.babies = babies;
    }

    public static void printList(List<?> list){
        for(Object elem : list){
            System.out.println(elem);
        }
    }

    public void print(List<? super Number> list) {
        for(Object n: list) {
            System.out.println(n);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", babies=" + babies +
                '}';
    }

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("jaguar");
        printList(animals);
        Animal animal = new Animal("jaguar", 3);
        animal.print(new ArrayList<Object>());
    }
}
