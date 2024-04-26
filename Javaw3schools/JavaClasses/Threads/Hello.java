public class Hello extends Thread {
    public static void main(String[] args){
        Hello thread = new Hello();
        thread.start();
        System.out.println("This code is outside of the thread");

    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}