class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }

}
class car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args){
        car nuka = new car();
        nuka.honk();
        System.out.println(nuka.brand + "  " + nuka.modelName);
    }
}

