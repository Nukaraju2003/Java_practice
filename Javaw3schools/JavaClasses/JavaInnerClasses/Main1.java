class outerclass {
    int x = 5;
    static class innerclass{
        int y = 10;
    }
}
public class Main1 {
    public static void main(String[] args){
        outerclass nuka = new outerclass();
        outerclass.innerclass raju = new outerclass.innerclass();
        System.out.println(nuka.x + raju.y);
    }
    
}
