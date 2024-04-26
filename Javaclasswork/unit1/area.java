
import java.util.*;
public class area {
    public static void main(String[] args){
        float base,height,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and height of the triangle");
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (float)0.5*base*height;
        System.out.println("area="+area);
    }
    
}
