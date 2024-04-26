public class Main2 implements Runnable {
    public static void main (String[] args){
        Main2 obj = new Main2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running outside of the thread"); 
    }
    
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
