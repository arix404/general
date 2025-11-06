class Priority{
public static void main(String[]args){
int[] arrival = {0,1,2,3};
int[] burst = {5,3,4,2};
int[] priority = {2,1,3,4};
int n = arrival.length, currentTime = 0;
boolean[] done = new boolean[n];

for (int count=0; count<n; count++) {
    int idx = -1, highest = Integer.MAX_VALUE;
    for (int i=0; i<n; i++) {
        if (!done[i] && arrival[i] <= currentTime && priority[i] < highest) {
            highest = priority[i];
            idx = i;
        }
    }
    if(idx == -1) { currentTime++; count--; continue; }
    System.out.println("Process P" + idx + " runs from " + currentTime + " to " + (currentTime + burst[idx]));
    currentTime += burst[idx];
    done[idx] = true;
}
}
}