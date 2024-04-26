public class CountNumberofwords{
    public static void main (String[] args){
        String words = " one Two Three four";
        int countwords = words.split("\\s").length;
        System.out.println(countwords);
    }

}