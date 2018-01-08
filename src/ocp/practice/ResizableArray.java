package ocp.practice;

import java.util.Arrays;

/**
 * Created by iuliab on 03.01.2018.
 */
public class ResizableArray {
    private int[] items = new int[8];
    private int size = 0;

    public int size() {
        return size;
    }

    public void set(int index, int item) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        items[index] = item;
    }

    private void append(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
    }

    private void ensureExtraCapacity() {
        if(size == items.length) {
            int[] copy = new int[2 * size];
            System.arraycopy(items, 0, copy, 0, size);
            items = copy;
        }
    }

    public int get(int index) {
        return items[index];
    }

    private void displayElements() {
        Arrays.stream(items).filter(item -> item != 0).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ResizableArray resizableArray = new ResizableArray();
        resizableArray.append(1);
        resizableArray.displayElements();
    }
}
