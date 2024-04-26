public class constructorparameter1 {
    int modelyear;
    String modelname;

    public constructorparameter1(int year, String name){
        modelyear = year;
        modelname = name;
    }
    public static void main(String[] args){
        constructorparameter1 nuka = new constructorparameter1(1969, "Mustang");
        System.out.println(nuka.modelyear + " " + nuka.modelname );
    }
    
}
