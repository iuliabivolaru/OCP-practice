package ocp.practice;

/**
 * Created by iuliab on 12.11.2017.
 */
public class Color {

    public int hue = 10;
    public class Shade {
        public int hue = Color.this.hue;
    }

    public static void main(String[] args) {
        System.out.println(new Color().new Shade().hue);
    }
}
