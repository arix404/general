public class PriorityP {
    public static void main(String[]args){
        int[] arrival = {0, 1, 2, 3};
int[] burst = {5, 3, 4, 2};
int[] priority = {2, 1, 3, 4};
int n = arrival.length;
int[] remaining = burst.clone();
int currentTime = 0;

while (true) {
    int idx = -1, highest = Integer.MAX_VALUE;
    boolean done = true;
    for (int i=0; i<n; i++) {
        if (arrival[i] <= currentTime && remaining[i] > 0) {
            done = false;
            if (priority[i] < highest) {
                highest = priority[i];
                idx = i;
            }
        }
    }
    if (done) break;
    remaining[idx]--;
    currentTime++;
    if (remaining[idx] == 0) System.out.println("Process P" + idx + " finished at " + currentTime);
}

    }
}
