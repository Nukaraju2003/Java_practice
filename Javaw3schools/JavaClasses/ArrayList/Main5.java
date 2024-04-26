import java.util.ArrayList;
import java.util.Collections;
public class Main5 {
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(44);
        myNumbers.add(20);
        myNumbers.add(35);
        myNumbers.add(0);
        Collections.sort(myNumbers);
        for (int i : myNumbers){
            System.out.println(i);
        }
    }
    
}
