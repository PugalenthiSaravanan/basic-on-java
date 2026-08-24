public class primenum{
    public static void main(String[] args) {
        int number = 4;
        boolean isprime =true;

        if(number <=1){
            isprime = false;

        }

        for(int i=2;i< number;i++){
            if (number % i == 0){
                isprime =false;
                break;
            }
        }
        if(isprime){
            System.out.println("The Number is Prime= "+ number);
        }
        else{
            System.out.println("The Number is Not Prime ="+number);
        }
    }
}