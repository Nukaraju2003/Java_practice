import java.util.ArrayList;  
public class Main3 {
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);
        for (int i : myNumbers){
            System.out.println(i);
        }
    }
    
}
