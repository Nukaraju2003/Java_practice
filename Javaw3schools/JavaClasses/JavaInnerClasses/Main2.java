class outerclass {
    int x = 15;

    class innerclass {
        public int myinnermethod(){
            return x;
        }
    }
}
public class Main2 {
    public static void main(String[] args){
        outerclass nuka = new outerclass();
        outerclass.innerclass raju = nuka.new innerclass();
        System.out.println(raju.myinnermethod());

    }
    
}
