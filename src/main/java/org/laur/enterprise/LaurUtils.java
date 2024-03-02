package org.laur.enterprise;

public class LaurUtils {
    private final int myNumber;
    public LaurUtils(int number) {
        myNumber = number;
    }

    public void PrintDoubleNumber() {
        System.out.println(myNumber);
    }


    public void PrintIsBigger(int num) {
        if (num > myNumber) {
            System.out.println(myNumber);
        }
    }

    public static void StaticUtilFunc() {
        System.out.println("I am very useful");
    }
}
