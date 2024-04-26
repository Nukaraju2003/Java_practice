package mypack;
class demo {
    public void display(){
        System.out.println("display method in mypack");
    }
    int x = 4;
}
import mypack.demo;
public class MyPackageClass {
    public static void main(String[] args){
        System.out.println("This is my package!");
    }
}
