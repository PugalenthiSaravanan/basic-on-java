public class nestedif{
    public static void main (String [] args){
        int mark = 49;
        if(mark >=50){
            System.out.println("All clear");
            if(mark >=80){
                System.out.println("Passed with Distingution");
            }
            else{
                System.out.println("Passed with First Class");
            }

        }
        else{
            System.out.println("Failed Better luck Next Time");
        }
    }
}