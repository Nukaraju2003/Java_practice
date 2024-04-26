import java.io.File;
import java.io.IOException;

public class CreateFile{
    public static void main(String[] args){
        try {
            File myobj = new File("D:\\Java Practice\\Javaw3schools\\FileHandling\\Files\\raju.txt.txt");
            if (myobj.createNewFile()){
                System.out.println("File created: " + myobj.getName());
            } else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}