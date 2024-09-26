import java.io.*;

public class Main {
    public static void main(String[] args) {

    }

    public static String printGreeting(String name) {
        String res = "Hello Tom";
        System.out.println(res);
        return res;
    }

    public static float calculate(int numOne, int numTwo, String operation) {
        float res = -1;
        switch (operation) {
            case "sum" -> {
                res = numOne + numOne;
                System.out.println(numOne + " + " + numTwo + " = " + res);
            }
            case "difference" -> {
                res = numOne - numTwo;
                System.out.println(numOne + " - " + numTwo + " = " + res);
            }
            case "product" -> {
                res = numOne * numTwo;
                System.out.println(numOne + " * " + numTwo + " = " + res);
            }
            case "quotient" -> {
                if (numTwo != 0) {
                    res = (float) numOne / (float) numTwo;
                    System.out.println(numOne + " / " + numTwo + " = " + res);
                } else System.out.println("Teilen durch 0 nicht möglich");
            }
            default -> System.out.println("Unbekannte Operation");
        }
        return res;
    }

    public static double calculatePerimeter(double sideLength) {
        double result = -1;
        if (sideLength >= 0) {
            result = 4 * sideLength;
        }
        return result;
    }

    public static double calculatePerimeter(double length, double width) {
        double result = -1;
        if (length >= 0 && width >= 0) {
            result = 2 * (length + width);
        }
        return result;
    }

    public static int countEvenNumbers(int[] numArray) {
        int result = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) result ++;
        }
        return result;
    }

    public static int[] findEvenNumbers(int[] numArray) {
        int [] evenNumberIndices = new int[countEvenNumbers(numArray)];
        int indexNewArray = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                evenNumberIndices[indexNewArray] = i;
                indexNewArray ++;
            }
        }
        return evenNumberIndices;
    }
}
