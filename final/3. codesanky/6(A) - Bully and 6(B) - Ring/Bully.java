import java.util.*;

public class Bully {

    public static void main(String args[]) {

        int p[] = {1,2,3,4,5};

        System.out.println("Processes are:");

        for(int i=0;i<p.length;i++) {
            System.out.println("P" + p[i]);
        }

        int coordinator = p[p.length-1];

        System.out.println("\nCoordinator is P" + coordinator);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter crashed process: ");

        int crash = sc.nextInt();

        System.out.println("\nProcess P" + crash + " crashed");

        coordinator = p[p.length-2];

        System.out.println("New Coordinator is P" + coordinator);
    }
}