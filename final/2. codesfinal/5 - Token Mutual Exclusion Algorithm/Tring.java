import java.util.*;

public class Tring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Ring: ");
        for (int i = 0; i < n; i++) System.out.print(i + " -> ");
        System.out.println("0");

        int ch;

        do {
            System.out.print("Enter sender: ");
            int s = sc.nextInt();

            System.out.print("Enter receiver: ");
            int r = sc.nextInt();

            System.out.print("Enter data: ");
            int d = sc.nextInt();

            System.out.print("Token passing: ");
            for (int i = 0; i <= s; i++) System.out.print(i + " -> ");
            System.out.println();

            System.out.println("Sender " + s + " sending " + d);

            for (int i = s; i != r; i = (i + 1) % n)
                System.out.println("Data " + d + " forwarded by " + i);

            System.out.println("Receiver " + r + " received " + d);

            System.out.print("Again? 1.Yes 0.No: ");
            ch = sc.nextInt();

        } while (ch == 1);
    }
}

// on terminal type:
// javac Tring.java
// java Tring

// Output enter
// Enter number of nodes: 5
// 1
// 3
// 100
// 0

// meaning to explain
// Meaning:

// 5 nodes
// sender = 1
// receiver = 3
// data = 100
// 0 = stop
