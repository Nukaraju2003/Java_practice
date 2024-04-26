public class Static {
    static void main1(){
        System.out.println("Static method no need to create object");
    }
    public void main2(){
        System.out.println("public method need to create object");
    }
    public static void main(String[] args){
        //Static.main1();
        Static raj = new Static();
        raj.main2();
    }
    
}
