abstract class Main {
    public String fname = "John";
    public int age = 8;
    public abstract void study(); 
    
}

class Student extends Main{
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all the year");
    }
}
