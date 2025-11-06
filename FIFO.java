public class FIFO {
    public static void main(String[]args)
    {
        int[] pages={2,3,2,1,5,2,4,5,3,2,5,2};
        int capacity=3;
     
        int[] queue=new int[capacity];
        int faults=0;
        int index=0;
        for(int page :pages){
            boolean found=false;
            for(int i :queue){
                if(i==page)found=true;
                if(!found){
                    queue[index]=page;
                    index=(index+1)%capacity;
                    faults++;
                }
            }
        }
        System.out.println("faults="+faults);
    }
}
