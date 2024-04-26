public class Acessmethodswithanobjectmultipleclasses {
    public static void main(String[] args){
        nuka myobj = new nuka();
        myobj.fullThrottle();
        myobj.speed(120);

    }
    
}

class nuka {
    public void fullThrottle(){
        System.out.println("I want to become millionaire...");
    }
    public void speed(int maxspeed){
        System.out.println("my speed is "+ maxspeed);
    }
}
