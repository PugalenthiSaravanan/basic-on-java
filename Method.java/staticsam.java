public class staticsam{
    static void title() {
        System.out.println("HELLO");
    }                                                               //Because both main() and title() are static, we can directly call
    public static void main(String[] args) {
        title();
    }
}

/*          ---METHOD OVRERVIEW---
Method       → reusable block of code
Parameter    → information received by method
return       → sends a value back
void         → sends nothing back*/