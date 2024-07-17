public class reallife {
    public static void main(String[] args){
        int[] age = {10, 20, 30, 40 ,50};
        float avg, sum = 0;
        for (int i = 0; i<age.length; i++){
            sum += age[i];

        }
        avg = sum/ age.length;
        System.out.println(avg);

    }
    
}
