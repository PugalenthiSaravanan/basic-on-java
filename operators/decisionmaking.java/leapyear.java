

public class leapyear{
    public static void main(String[] args) {
        int year = 2014;
        if(year % 400 ==0){
            System.out.println("LEAP YEAR =" + year);}
        else if (year % 100 == 0){
            System.out.println("NON LEAP YEAR =" + year);
        }
        else if(year % 4 == 0 ){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Non leap year");
        }
    }
}