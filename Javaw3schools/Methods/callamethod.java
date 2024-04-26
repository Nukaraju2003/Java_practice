/* public class callamethod { 
    static void newMethod() {
        System.out.println("I just got executed!");
    }
    
    public static void main(String[] args){
        newMethod();
    }
}
*/

public class callamethod {
    static void myMethod(){
        System.out.println("I just got executed!");
    }
    public static void main(String[] args){
        myMethod();
        myMethod();
        myMethod();
    }
}