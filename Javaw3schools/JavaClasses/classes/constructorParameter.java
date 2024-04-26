public class constructorParameter {
    int x;
    
    public constructorParameter(int y){
        x = y;
    }

    public static void main(String[] args){
        constructorParameter nuka = new constructorParameter(5);
        System.out.println(nuka.x);

    }
}
