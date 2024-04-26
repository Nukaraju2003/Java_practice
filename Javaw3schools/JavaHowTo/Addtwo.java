import java.util.Scanner; 

public class Addtwo {
    public static void main(String[] args){
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter first number: ");
        x = myObj.nextInt();
        System.out.println("enter a second number: ");
        y = myObj.nextInt();

        sum = x+ y;

        System.out.println("Sum is: " + sum);


    }
    
}
