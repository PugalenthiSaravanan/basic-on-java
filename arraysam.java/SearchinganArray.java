public class SearchinganArray{
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        int search = 40;
        boolean found = false;
        int index= -1;

        for(int i = 0; i< numbers.length;i++){
            if (numbers [i] == search){
                found = true;
                index = i;
                break;
            }
        }
        if (found){
            System.out.println( " number found " + index);
        }
        else{
            System.out.println("Number Not Found");
        }
    }
}

// finding the array value found or not and also the index position
