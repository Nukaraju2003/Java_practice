enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main1 {
    public static void main(String[] args){
        Level myvar = Level.MEDIUM;
        
        switch(myvar){
            case LOW:
            System.out.println("Low Level");
            break;
            case MEDIUM:
            System.out.println("MEDIUM Level");
            break;
            case HIGH:
            System.out.println("HIGH Level");
            break;
        }
    }
    
}
