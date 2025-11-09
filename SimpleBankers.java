import java.util.Scanner;

public class SimpleBankers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        System.out.print("Enter total available instances of resource: ");
        int available = sc.nextInt();

        int[] max = new int[n];
        int[] alloc = new int[n];
        int[] need = new int[n];
        boolean[] finish = new boolean[n];

        System.out.println("Enter max resource needed per process:");
        for (int i = 0; i < n; i++) max[i] = sc.nextInt();

        System.out.println("Enter allocated resource per process:");
        for (int i = 0; i < n; i++) {
            alloc[i] = sc.nextInt();
            need[i] = max[i] - alloc[i];
        }

        int work = available;
        int done = 0;

        while (done < n) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (!finish[i] && need[i] <= work) {
                    work += alloc[i]; // release resources as if process finished
                    finish[i] = true;
                    done++;
                    System.out.println("Process " + i + " finished");
                    found = true;
                }
            }
            if (!found) break; // no process can proceed further
        }

        if (done == n) System.out.println("Safe: No deadlock");
        else System.out.println("Unsafe: Deadlock possible");
    }
}
