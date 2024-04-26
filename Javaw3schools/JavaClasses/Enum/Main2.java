enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main2 {
    public static void main(String[] args){
        for (Level myvar : Level.values()){
            System.out.println(myvar);
        }
    }
    
}
