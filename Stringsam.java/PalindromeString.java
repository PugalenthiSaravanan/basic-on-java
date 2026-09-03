public class PalindromeString{
    public static void main(String[] args) {
        String name = "pugal";
        String reverse = "";

        for(int i =name.length() - 1; i>=0; i--){
            reverse = reverse +name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("NOT a Palindrom");
        }
    }    
}

/*  
common steps used in reverse @ palindrome

    String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }*/