class Animal {
    public void animalSound(){
        System.out.println("The animal is making a sound");
    }
}

class Pig extends Animal {
    public void animalSound () {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound (){
        System.out.println("The dog says: bow bow");
    }
}

class Polymorphism{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Pig myPig = new Pig();
        Dog myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}