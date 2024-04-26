public class ReverseString {
    public static void main(String[] args){
        String str = "Hello";

        char[] chArr = str.toCharArray();
        for (int i = chArr.length -1; i >= 0; i--){
            System.out.println(chArr[i]);
        }
    }
}