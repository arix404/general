public class RR {
    public static void main(String[]args)
    {
        int[] arrival = {0,1,2,3};
int[] burst = {5,3,4,2};
int timeQuantum = 2;
int n = arrival.length;
int[] remaining = burst.clone();
int currentTime = 0;

while (true) {
    boolean done = true;
    for (int i=0; i<n; i++) {
        if (remaining[i] > 0 && arrival[i] <= currentTime) {
            done = false;
            int time = Math.min(timeQuantum, remaining[i]);
            System.out.println("Process P" + i + " runs from " + currentTime + " to " + (currentTime + time));
            remaining[i] -= time;
            currentTime += time;
        }
    }
    if (done) break;
}

    }
}
