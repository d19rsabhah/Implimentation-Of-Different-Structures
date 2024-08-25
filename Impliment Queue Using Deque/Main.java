import java.util.*;

public class Main {

    Deque<Integer> deque = new ArrayDeque<>();

    public int Peek() {
        if (!deque.isEmpty()) {
            return deque.getFirst();
        } else {
            return -1;
        }
    }

    public void Add(int val) {
        deque.addLast(val);
        System.out.println(val + " is inserted!");
    }

    public int Remove() {
        if (!deque.isEmpty()) {
            return deque.removeFirst();
        } else {
            return -1;
        }
    }

    public int Size() {
        return deque.size();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int input;
		System.out.println("Type different digit to perform different operation : ");
        do {
            System.out.println("Enter 1 to add, 2 to get the front, 3 to remove, 4 to know the size, 5 to quit...");
            input = sc.nextInt();
            
            switch (input) {
                case 1:
                    System.out.println("Enter value to add:");
                    obj.Add(sc.nextInt());
                    break;
                case 2:
                    int peekResult = obj.Peek();
                    if (peekResult == -1) {
                        System.out.println("Queue is Empty!");
                    } else {
                        System.out.println("Front element: " + peekResult);
                    }
                    break;
                case 3:
                    int removeResult = obj.Remove();
                    if (removeResult == -1) {
                        System.out.println("Queue is Empty, Can't remove!");
                    } else {
                        System.out.println("Removed element: " + removeResult);
                    }
                    break;
                case 4:
                    System.out.println("Size of the deque: " + obj.Size());
                    break;
                case 5:
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Please Enter a correct value!");
            }
            
        } while (input != 5);
        
        sc.close();
    }
}
