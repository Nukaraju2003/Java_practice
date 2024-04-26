public class StaticPublic {
    static void staticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void publicMethod(){
        System.out.println("public methods can be called only creating objects");
    }

    public static void main(String[] args){
        staticMethod();
        //publicMethod();

        StaticPublic myobj = new StaticPublic();
        myobj.publicMethod();


    }
    
}
