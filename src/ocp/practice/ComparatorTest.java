package ocp.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by iuliab on 08.08.2017.
 */
public class ComparatorTest {

    public static void main(String[] args) {
        Comparator<Animal> compByBabiesNumber = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.babies - o2.babies;
            }
        };

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal("Mark", 2));
        listOfAnimals.add(new Animal("Mark", 3));
        listOfAnimals.add(new Animal("Mark", 1));
        listOfAnimals.add(new Animal("Mark", 7));

        Collections.sort(listOfAnimals, compByBabiesNumber);
        for(Animal a : listOfAnimals) {
            System.out.println(a);
        }
    }
}
