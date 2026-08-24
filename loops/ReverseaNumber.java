public class ReverseaNumber{
    public static void main(String[] args) {
        int number = 987654321;
        int reverse = 0;                          /* 3 steps is inmportant 
                                                    digit =  number % 10
                                                    reverse = reverse *10 + digit
                                                    number = number /10 */

        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }
        System.out.println("Reverse number =" + reverse);
    }
}