import java.util.*;

public class Ring {
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
                    System.out.print("Enter initiator process: ");
                    int start = sc.nextInt();
                    ArrayList<Integer> list = new ArrayList<>();
                    int temp = start - 1;

                    do {
                        if (p[temp]) {
                            list.add(temp + 1);
                            System.out.println("P" + (temp + 1) + " passes: " + list);
                        }
                        temp = (temp + 1) % n;
                    } while (temp != start - 1);

                    coordinator = Collections.max(list);
                    System.out.println("New Coordinator = P" + coordinator);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}

// on terminal
// javac Ring.java
// java Ring

// input on output:
// Enter number of processes: 5

// 1.Display  2.Down  3.Up  4.Election  5.Exit
// 2
// Enter process to down: 5

// 1.Display  2.Down  3.Up  4.Election  5.Exit
// 4
// Enter initiator process: 2

// 1.Display  2.Down  3.Up  4.Election  5.Exit
// 1
