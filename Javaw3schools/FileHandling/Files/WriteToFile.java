import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("D:\\Java Practice\\Javaw3schools\\FileHandling\\Files\\raju.txt.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!I want to become millioniare and i want to rule the world");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
}
