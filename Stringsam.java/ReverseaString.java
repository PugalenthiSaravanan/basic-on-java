public class ReverseaString{
    public static void main(String[] args) {
        String name = "PUGAL";
        String reverse = "";

        for(int i =name.length() - 1; i >= 0;i--)                         
        {
            reverse = reverse + name.charAt(i);
        }
         System.out.println(reverse);
    }
   
}

/*  
common steps used in reverse @ palindrome

    String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }*/