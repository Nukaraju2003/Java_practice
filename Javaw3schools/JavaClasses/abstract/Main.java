abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    public void sleep(){
        System.out.println("ZZZ");
    }

}

class Pig extends Animal {
    public void animalSound(){
        // The body of animalSound() is provided here 
        System.out.println("The pig says: wee wee");
    }
}


class Main {
    public static void main(String[] args){
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
    
}
