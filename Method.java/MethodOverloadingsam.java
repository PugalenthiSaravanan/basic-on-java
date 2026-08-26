public class MethodOverloadingsam{
    static int add(int a , int b){
        return a+b;
    }
    static int sub(int a , int b){
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println(add( 10,5));
        System.out.println(sub(10,5));
    }
}