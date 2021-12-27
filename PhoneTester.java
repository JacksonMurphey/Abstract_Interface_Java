public class PhoneTester {
    
    public static void main(String[] args) {
        
        Galaxy s9 = new Galaxy("S9", "Verizon", "Beep Beep Beep", 99);
        IPhone iPhone = new IPhone("13Max", "AT&T", "Ring Ring Ring", 100);

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iPhone.displayInfo();
        System.out.println(iPhone.ring());
        System.out.println(iPhone.unlock());
        iPhone.call();
        s9.call();

    }
}
