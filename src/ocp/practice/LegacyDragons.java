package ocp.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliab on 01.02.2018.
 */

class Dragon {}
class Unicorn {}
public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragons(unicorns);

        List<Unicorn> checkedUnicorns = new ArrayList<>();
        addUnicorn(checkedUnicorns);
        Unicorn unicorn = checkedUnicorns.get(0);
    }

    private static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon());
    }

    private static void printDragons(List<Dragon> dragons) {
        for(Dragon dragon : dragons) {
            System.out.println(dragon);
        }
    }
}
