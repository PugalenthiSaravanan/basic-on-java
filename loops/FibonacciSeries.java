public class FibonacciSeries{
    public static void main(String[] args) {
        int first = 0;
        int second = 1;                                 //0 1 1 2 3 5 8 13 21...

    for(int i=1;i<=10;i++){
        System.out.print(first+" ");
    int next = first+ second;
    first = second;
    second = next;
        }
    
     }
}