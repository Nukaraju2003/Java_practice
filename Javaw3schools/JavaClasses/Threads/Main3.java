public class Main3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args){
        Main3 thread = new Main3();
        thread.start();
        System.out.println("amount is " + amount);
        amount++;
        System.out.println(amount);
    }
    
    public void run(){
        amount++;
    }
}
