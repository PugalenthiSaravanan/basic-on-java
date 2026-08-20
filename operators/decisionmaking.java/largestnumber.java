public class largestnumber{
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 30;

        if (a >=b && a >=c){
            System.out.println("Largest Number is A :" + a);

        }
        else if (b >= c && b>= a){
            System.out.println("Largest Number is B :" + b);
            
        }
        else{
            System.out.println("Largest number is C :" + c);
        }
    }
}