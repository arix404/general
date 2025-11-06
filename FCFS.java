class FCFS {
    public static void main(String[] args) {
        int[] arrival = {10, 0, 8, 5}; // arrival times of processes P1, P2, P3, P4
        int[] burst = {2, 10, 4, 5};    // burst times of processes
        int n = arrival.length;

        int[] start = new int[n];
        int[] finish = new int[n];
        int currentTime = 0;

        // Schedule processes in order of arrival
        for (int i = 0; i < n; i++) {
            if (currentTime < arrival[i]) currentTime = arrival[i];
            start[i] = currentTime;
            finish[i] = start[i] + burst[i];
            currentTime = finish[i];
            System.out.println("P" + (i+1) + ": Start at " + start[i] + ", finish at " + finish[i]);
        }
    }
}
