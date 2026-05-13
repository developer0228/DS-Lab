import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        int token = 0;

        System.out.println("Processes are:");

        for(int i=0; i<n; i++) {
            System.out.println("P" + i);
        }

        System.out.print("\nEnter process number: ");
        int ch = sc.nextInt();

        while(token != ch) {

            System.out.println(
            "Token passing from P" + token +
            " to P" + (token + 1) % n);

            token = (token + 1) % n;
        }

        System.out.println(
        "\nProcess P" + ch +
        " is in Critical Section");
    }
}