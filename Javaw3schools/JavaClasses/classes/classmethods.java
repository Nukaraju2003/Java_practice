// public class classmethods {
//     static void myMethod(){
//         System.out.println("Hello World!");
//     }
//     public static void main(String[] args){
//         myMethod();
//     }
    
// }

public class classmethods {
    public static void main(String[] args){
        myMethod newobj = new myMethod();
        System.out.println(newobj.char1);

    }
}
class myMethod{
        String char1 = "Hello World!";
}
