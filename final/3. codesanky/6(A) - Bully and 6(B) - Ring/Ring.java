import java.util.*;

public class Ring {

    public static void main(String args[]) {

        int p[] = {1,2,3,4,5};

        System.out.println("Processes are:");

        for(int i=0;i<p.length;i++) {
            System.out.println("P" + p[i]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter crashed process: ");

        int crash = sc.nextInt();

        System.out.println("\nElection message passing in ring");

        int leader = p[p.length-2];

        System.out.println("Leader elected is P" + leader);
    }
}