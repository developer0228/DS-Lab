import java.util.*;

public class Bully {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        boolean[] p = new boolean[n];
        for (int i = 0; i < n; i++) p[i] = true;

        int coordinator = n;

        while (true) {
            System.out.println("\n1.Display  2.Down  3.Up  4.Election  5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < n; i++)
                        System.out.println("P" + (i + 1) + (p[i] ? " is up" : " is down"));
                    System.out.println("Coordinator: P" + coordinator);
                    break;

                case 2:
                    System.out.print("Enter process to down: ");
                    p[sc.nextInt() - 1] = false;
                    break;

                case 3:
                    System.out.print("Enter process to up: ");
                    p[sc.nextInt() - 1] = true;
                    break;

                case 4:
                    System.out.print("Enter process initiating election: ");
                    int start = sc.nextInt();

                    coordinator = start;

                    for (int i = start; i < n; i++) {
                        if (p[i]) {
                            System.out.println("Election message from P" + start + " to P" + (i + 1));
                            coordinator = i + 1;
                        }
                    }

                    System.out.println("New Coordinator = P" + coordinator);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}



// On terminal:

// javac Bully.java
// java Bully


// output enter:

// Enter number of processes: 5

// 2
// 5

// 4
// 2

// 1