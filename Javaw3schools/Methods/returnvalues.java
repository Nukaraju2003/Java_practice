// one parameter 
// public class returnvalues {
//     static int myMethod(int x){
//         return 5 + x;
//     }
//     public static void main(String[] args){
//         System.out.println(myMethod(3));
//     }
// }

// two parameters
// public class returnvalues {
//     static int myMethod(int x, int y){
//         return x + y;
//     }
//     public static void main(String[] args){
//         System.out.println(myMethod(5, 3));
//     }
// }

// store the result in a variable

public class returnvalues {
    static int myMethod(int x, int y){
        return x + y;
    }
    public static void main(String[] args){
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}