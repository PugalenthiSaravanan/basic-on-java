public class Electricitybill{
    public static void main(String[] args) {
        int unit = 300;
        double bill;
        if( unit >= 100){
            bill = unit *2;
        }
        else if (unit >=200){
            bill = (100 * 2) + ((unit - 100)*3 );
        }
        else {
            bill = (100 *2) +(100*3) + ((unit - 200) *5); 
        }
        System.out.println("Electricity unit =  " + unit);
        System.out.println("Electricity Bill Amount =  " + bill);
    }

}