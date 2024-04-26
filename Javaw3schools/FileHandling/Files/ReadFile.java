import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFile {
    public static void main(String[] args){
        try {
            File myobj = new File("D:\\Java Practice\\Javaw3schools\\FileHandling\\Files\\raju.txt.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        }
        catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
}
