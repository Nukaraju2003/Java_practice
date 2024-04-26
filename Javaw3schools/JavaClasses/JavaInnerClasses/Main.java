class outerclass {
    int x = 10;

class innerclass {
    int y = 15;
}
}


public class Main {
    public static void main(String[] args){
        outerclass nuka = new outerclass();
        outerclass.innerclass raju = nuka.new innerclass();
        System.out.println(nuka.x + raju.y);
    }
    
}
