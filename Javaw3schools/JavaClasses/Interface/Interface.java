interface Animal {
    public void animalSound();  // interface method (does not have a body)
    public void sleep();   // interface method (does not have a body)
}
class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says : wee wee");
    }
    public void sleep(){
        System.out.println("ZZZ");
    }
}
public class Interface {
    public static void main(String[] args){
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
    
}
