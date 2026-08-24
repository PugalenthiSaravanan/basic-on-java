public class Palindrome{
    public static void main(String[] args) {
        int number = 129327;
        int originalnumber = number;
        int reverse = 0;

        while(number !=0){
            int digit = number % 10;
            reverse = reverse *10 + digit;          /* its steps like reversenumber  */
            number = number/ 10;

        }
        if(originalnumber == reverse){
            System.out.println("The number is Palindrome =" + originalnumber );
        }
        else {
            System.out.println("Not Palindrome =" + originalnumber );
        }
    }
}