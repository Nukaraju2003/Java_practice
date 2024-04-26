import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "ope1");
        //cars.remove(0);
        //cars.clear();
        System.out.println(cars.size());//(.get(0));
    }
    
}
