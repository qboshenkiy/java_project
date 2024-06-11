package BigInt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BigIntegerCustom num1 = new BigIntegerCustom("100");
        BigIntegerCustom num2 = new BigIntegerCustom("10");

        ArrayList<Integer> sum = BigIntegerCustom.addBigInt(num1, num2);
        ArrayList<Integer> minus = BigIntegerCustom.minusBigInt(num1, num2);
        ArrayList<Integer> multy = BigIntegerCustom.multyBigInt(num1, num2);
        ArrayList<Integer> slash = BigIntegerCustom.slashBigInt(num1, num2);

        System.out.println("+: " + listToString(sum));
        System.out.println("-: " + listToString(minus));
        System.out.println("*: " + listToString(multy));
        System.out.println("/: " + listToString(slash));
    }

    private static String listToString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num);
        }
        return sb.toString();
    }
}

