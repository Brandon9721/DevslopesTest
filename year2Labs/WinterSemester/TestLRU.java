// Brandon Byrne (20115464)
// Lab 3 POSIX CT2530
// February 23, 2017
// Professor: Kashif Amjad

public class TestLRU {
    public static void main(String[] args) {
        LRU test = new LRU(5);
        test.print();
        System.out.println();
        test.reference(5);

        test.print();
        System.out.println();
        
        test.reference(5);
        test.print();
        System.out.println();
        
        test.reference(2);
        test.print();
        System.out.println();
        
        test.reference(1);
        test.print();
        System.out.println();
        
        test.reference(2);
        test.print();
        System.out.println();
        
        test.reference(3);
        test.print();
        System.out.println();
        
        test.reference(4);
        test.print();
        System.out.println();
        
        test.reference(3);
        test.print();
        System.out.println();
        
        test.reference(5);
        test.print();
        System.out.println();
        
        test.reference(2);
        test.print();
        System.out.println();
    }
}
