import java.util.HashSet;
public class AddItems {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Vovlo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");
        //cars.remove("Vovlo");
        //cars.clear();
        for (String i : cars){
        System.out.println(i);
        }
    }
    
}
