import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    Deque<Integer> deque = new ArrayDeque<>();

    public int Peek() {
        if (!deque.isEmpty()) {
            return deque.getLast();
        } else {
            return -1;
        }
    }

    public void Push(int val) {
        deque.addLast(val);
        System.out.println(val + " has been pushed into the Stack!");
    }

    public int Pop() {
        if (!deque.isEmpty()) {
            return deque.removeLast();
        } else {
            return -1;
        }
    }

    public int Size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Type different digit to perform different operation : ");
        do {
            System.out.println(
                    "Enter 1 to push, 2 to get the top, 3 to pop, 4 to know the size, 5 to know weather the statck is Empty, 6 to Exit...");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter value to add:");
                    obj.Push(sc.nextInt());
                    break;
                case 2:
                    int peekResult = obj.Peek();
                    if (peekResult == -1) {
                        System.out.println("Stack is Empty!");
                    } else {
                        System.out.println("Front element: " + peekResult);
                    }
                    break;
                case 3:
                    int removeResult = obj.Pop();
                    if (removeResult == -1) {
                        System.out.println("Stack is Empty, Can't remove!");
                    } else {
                        System.out.println("Removed element: " + removeResult);
                    }
                    break;
                case 4:
                    System.out.println("Size of the stack: " + obj.Size());
                    break;
                case 5:
                    if (obj.isEmpty()) {
                        System.out.println("Stack is Empty!");
                    } else {
                        System.out.println("Stack is not Empty!");
                    }
                    break;
                case 6:
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Please Enter a correct value!");
            }

        } while (input != 6);

        sc.close();
    }
}