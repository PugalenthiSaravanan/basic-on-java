public class anotherMethodOverloadingsam{
    static int multiplication(int a , int b){
        return a+b;
    }
    static double division(int a , int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println(multiplication(2,2));
        System.out.println(division(100,3));
    }
}