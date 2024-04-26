import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormattingDateandTime {
    public static void main(String[] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting:  " + myDateObj);
        DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = myDateObj.format(myFormatobj);
        System.out.println("After formatting: " + formattedDate);
    }
    
}
