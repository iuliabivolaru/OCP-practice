package ocp.practice;

/**
 * Created by iuliab on 28.12.2017.
 */

import java.io.*;
import java.util.*;

public class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solutions {
    public static Node insert(Node head, int data) {
        //Complete this method
        Node start = head;
        if (start == null) {
            start = new Node(data);
            return start;
        }
        if (start.next == null) {
            head.next = new Node(data);
            return head;
        }
        while (start.next != null) {
            start = start.next;
        }
        start.next = new Node(data);

        return head;
    }


    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}