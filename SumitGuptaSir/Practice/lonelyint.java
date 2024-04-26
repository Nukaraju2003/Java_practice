public class lonelyint {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        int lonely = lonelyinteger(numbers);
        System.out.println(lonely);
    }
    
}
