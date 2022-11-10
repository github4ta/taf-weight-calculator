package by.it_academy.taf_wc;

public class Util {
    public static void waiter() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


