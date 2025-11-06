import java.util.*;
class Sync{
    int readcount=0;
    final Object mutex=new Object();
    final Object writelock=new Object();

    void startread(){
        synchronized(mutex){
            readcount++;
        }
        if (readcount==1){
            synchronized(writelock){};
        }
    }

    void endread(){
        synchronized(mutex){
            readcount--;
        }
        if (readcount==0){
            synchronized(writelock){};
        }
    }

    void startwrite(){
        synchronized(writelock){}
    }
    void endwrite(){
        synchronized(writelock){}
    }
}
    class Reader extends Thread{
        Sync s;
        Reader(Sync s){this.s=s;}
        public void run(){
            s.startread();
            System.out.println("reading....");
            s.endread();
        }
    }
    class Writer extends Thread{
        Sync s;
        Writer(Sync s){this.s=s;}
        public void run(){
            s.startwrite();
            System.out.println("writing....");
            s.endwrite();
        }
    }

    public class ReaderWriter{
        public static void main(String []args){
            Sync s=new Sync();
            new Reader(s).start();
            new Writer(s).start();
        }
    }