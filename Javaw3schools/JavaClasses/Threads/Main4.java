public class Main4 extends Thread {
    public static int amount = 0;
    public static void main(String[] args){
        Main4 thread = new Main4();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("Main: "+ amount);
        amount++;
        System.out.println("Main2: "+ amount);
    }
    public void run(){
        amount++;
    }
}
