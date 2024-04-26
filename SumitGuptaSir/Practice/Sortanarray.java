import java.util.Arrays;
//import java.util.Collections;
public class Sortanarray {
    public static void main(String[] args){
        Integer[] ar = {15, 118, 35, 29, 174, 109, 21, 92, 1, 100};
        Arrays.sort(ar);
        for (int i = 0; i< ar.length; i++){
            System.out.println(ar[i]);
        }
        ///Arrays.sort(ar, Collections.reverseOrder());
        //System.out.print("Modified ar[] in descending order: %s", Arrays.toString(ar));

    }
    
}
