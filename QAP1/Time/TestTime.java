package QAP1.Time;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Set times using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        System.out.println();
        System.out.println("T1 before: " + t1);
        System.out.println("T2 before: " + t2);

        // Call nextSecond for t1 and previousSecond for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display final times using toString() method
        System.out.println();
        System.out.println("T1 after nextSecond(): " + t1);
        System.out.println("T2 after previousSecond(): " + t2);
        System.out.println();
    }
};
