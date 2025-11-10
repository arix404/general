class FCFS {
    public static void main(String[] args) {
        int[] arrival = {10, 0, 8, 5}; // arrival times of processes P1, P2, P3, P4
        int[] burst = {2, 10, 4, 5};    // burst times of processes
        int n = arrival.length;

        int[] start = new int[n];
        int[] finish = new int[n];
        int currentTime = 0;
        int[] tat = new int[n];
        int[] wt= new int[n];
        // Schedule processes in order of arrival

         System.out.println("Process\t" + "arrival\t" + "burst\t" + "completion\t" + " tat\t" + "wt\t");
        for (int i = 0; i < n; i++) {
            if (currentTime < arrival[i]) currentTime = arrival[i];
            start[i] = currentTime;
            finish[i] = start[i] + burst[i];
            currentTime = finish[i];
            tat[i]=finish[i]-arrival[i];
            wt[i]=tat[i]-burst[i];
            
            System.out.println("P"+(i+1) + "\t"+arrival[i] + "\t"+burst[i] + "\t"+finish[i] + " \t\t"+tat[i] + "\t"+wt[i]);
        }
    }
}
