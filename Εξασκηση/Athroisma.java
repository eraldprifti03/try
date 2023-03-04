import java.util.Scanner;

public class Athroisma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, sum = 0, count = 0;
        double avg;
        char choice;

        do {
            do {
                System.out.print("Dwse ari8mo: ");
                x = scanner.nextInt();
                if (x <= 0) {
                    System.out.println("Lathos air8mow, Dvse ksana..");
                }
            } while (x <= 0);

            sum += x;
            count++;

            System.out.print("Nea metrhsh; ");
            choice = scanner.next().charAt(0);
        } while (choice != 'o' && choice != 'O');

        avg = (double) sum / count;
        System.out.printf("Atrroisma: %5d\n", sum);
        System.out.printf("Mesos oros: %6.2f\n", avg);
    }
}
