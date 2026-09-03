public class multipleobjectsam{
    String name;
    int Age;
        void display(){
            System.out.println("Name = "+name + " " + " Age =" + Age);
        }
    public static void main(String[] args) {
        multipleobjectsam s1 = new multipleobjectsam();
        s1.name = "pugal";
        s1.Age = 25;

        multipleobjectsam s2 = new multipleobjectsam();
        s2.name = "saravanan";
        s2.Age = 60;


       s1.display();
       s2.display();                                  // using display suitable for this code
       
    }
}