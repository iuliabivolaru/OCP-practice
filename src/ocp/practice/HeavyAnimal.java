package ocp.practice;

/**
 * Created by iuliab on 23.09.2017.
 */
public class HeavyAnimal {
    public static void main(String[] args) {
        Hippo otherHippo = new Hippo();
        //Elephant in loc de Mother ar fi fost compiler err
        boolean b = otherHippo instanceof Mother;
        Hippo.Inner hipp = new Hippo.Inner();
        Mother hippo = new BabyHippo();
        //hippo.eat();
    }
}
class Hippo extends HeavyAnimal {
    private String name;
    public void eat() {
        System.out.println("it eats");
    }
    protected static class Inner {
        int number;
        public void go() {
             Hippo hipp = new Hippo();
             String str = hipp.name;
        }
    }
}
class Elephant extends HeavyAnimal {
}
interface Mother {
    public void feedBaby();
}
class BabyHippo extends Hippo implements Mother {

    @Override
    public void feedBaby() {

    }
}
