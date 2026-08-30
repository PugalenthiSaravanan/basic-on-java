public class FindingMinimum {
    public static void main(String[] args) {
        int [] numbers = { 10 , 5 , 1, 2, 12, 15};
        int min = numbers[0];

        for( int i = 0; i<numbers.length; i++){
            if (numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println("Minimum value =" + min);
    }
}