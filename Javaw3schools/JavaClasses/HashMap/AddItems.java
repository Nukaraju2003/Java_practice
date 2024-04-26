import java.util.HashMap; 

public class AddItems {
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String,String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        //System.out.println(capitalCities.remove("England"));
        //capitalCities.clear();
        //System.out.println(capitalCities.size());
        for (String i : capitalCities.keySet()){
            System.out.println("key: " + i + " value: " + capitalCities.get(i) );
        }
        
    }
    
}
