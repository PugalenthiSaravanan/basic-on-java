public class constructorsam{
    int Age;
    String Name;
    
    constructorsam(){
        System.out.println("update");
    }

    public static void main(String[] args) {
        constructorsam s1 = new constructorsam();
        System.out.println(s1.Name);
    }
    
                                      //line 10 call line 6 then print line 11 as NUll due to constructor default 
}