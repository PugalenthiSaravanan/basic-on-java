public class FindingMaximum{
    public static void main(String[] args) {
        int [] numbers = { 10 , 20, 5 , 7 , 1 ,8};

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        } 
        System.out.println("MAXIMUM VALVUE =" + max);
    }
}