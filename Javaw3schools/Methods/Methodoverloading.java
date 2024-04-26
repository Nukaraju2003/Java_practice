public class Methodoverloading {
    static int plusmethod(int x, int y){
        return x + y;
    } 
    static double plusmethod(double x, double y){
        return x + y;
    }
    
    public static void main(String[] args){
        int z = plusmethod(1,2);
        double m = plusmethod(1.3,1.5);
        System.out.println(z);
        System.out.println(m);
    }
}
