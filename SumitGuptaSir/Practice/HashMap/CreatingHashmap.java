import java.util.HashMap; 
public class CreatingHashmap {
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("john", 25);
        hashMap.put("jane", 30);
        hashMap.put("Jim", 35);
        System.out.println(hashMap.get("john"));
        hashMap.remove("Jim");
        System.out.println(hashMap.containsKey("Jim"));
        System.out.println(hashMap.size());

    }
    
}
