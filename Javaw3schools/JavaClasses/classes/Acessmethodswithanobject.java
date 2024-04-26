public class Acessmethodswithanobject {
    public void fullThrottle(){
        System.out.println("I want to become millionaire...");
    }

    public void speed(int maxspeed){
        System.out.println("my speed is " + maxspeed);
    }

    public static void main(String[] args){
        Acessmethodswithanobject raju = new Acessmethodswithanobject();
        raju.fullThrottle();
        raju.speed(110);
    }

    
}
