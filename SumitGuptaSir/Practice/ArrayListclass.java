import java.util.*; 
public class ArrayListclass {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al:"+ al.size());
        al.add("c");
        al.add("f");
        al.add(1,"d");
        System.out.println("Size of al after additions: "+ al.size());
        System.out.println("Contents of al: "+al);

    }

    
}
