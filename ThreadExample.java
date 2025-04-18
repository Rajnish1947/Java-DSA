
public class ThreadExample {
    public static void main(String[] args) {
        Firstthread t1=new Firstthread();
        Firstthread1 t2=new Firstthread1();
        t1.start();
        t2.start();
    }
} 
class Firstthread extends Thread{
    public void run(){
        for(int i=1 ; i <=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("threadd is interruptation");
            }

        }
        System.out.println("first thread is exixting");
    }

}
class Firstthread1 extends Thread{
    public void run(){
        for(int i=1 ; i <=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("threadd is interruptation");
            }

        }
        System.out.println("second thread is exixting");
    }

}