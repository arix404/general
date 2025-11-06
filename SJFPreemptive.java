class SJFPreemptive {
    public static void main(String[] args) {
        int[] arrival = {0, 1, 2, 3}; // arrival times P1 to P4
        int[] burst = {8, 4, 2, 1};   // burst times
        int n = arrival.length;
        int[] remaining = burst.clone();
        int currentTime = 0, completed = 0;

        while (completed < n) {
            int shortest = -1, minBurst = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arrival[i] <= currentTime && remaining[i] > 0 && remaining[i] < minBurst) {
                    minBurst = remaining[i];
                    shortest = i; // select shortest remaining time process available
                }
            }

            if (shortest == -1) {
                currentTime++; // if no process available, increment time
                continue;
            }

            remaining[shortest]--;
            currentTime++;

            if (remaining[shortest] == 0) {
                completed++;
                System.out.println("Process P" + (shortest + 1) + " finished at time " + currentTime);
            }
        }
    }
}
