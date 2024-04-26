public class ifelse {
    static void checkage(int age){
        if (age < 18){
            System.out.println("Access denied - you are not old enough!");
            
        }
        else {
            System.out.println("Access granted - you are old enough!");

        }
    }
    public static void main(String[] args){
        checkage(20);
    }
    
}
