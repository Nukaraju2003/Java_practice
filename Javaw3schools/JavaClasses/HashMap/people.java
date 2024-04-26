import java.util.HashMap; 
public class people {
    public static void main(String[] args){
        HashMap<String, Integer> person = new HashMap<String, Integer>();
        person.put("John", 32);
        person.put("Steve", 30);
        person.put("Angie", 33);

        for (String i : person.keySet()){
            System.out.println("key: " + i + "value: " + person.get(i));
        }

    }
    
}
