package BigInt;

import java.util.ArrayList;
import java.util.Collections;

public class BigIntegerCustom {

    private ArrayList<Integer> list;

    public BigIntegerCustom(String d) {
        for (char c : d.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new IllegalArgumentException("Illegal character: " + c);
            }
        }

        d = d.replaceAll(" ", "");
        list = new ArrayList<>();

        for (int i = 0; i < d.length(); i++) {
            list.add(d.charAt(i) - '0');
        }
    }

    public static ArrayList<Integer> addBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int carry = 0, sum = 0;

        while (itA >= 0 || itB >= 0 || carry != 0) {
            sum = carry;
            if (itA >= 0) {
                sum += aList.get(itA--);
            }
            if (itB >= 0) {
                sum += bList.get(itB--);
            }

            carry = sum / 10;
            result.add(sum % 10);
        }

        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> minusBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int borrow = 0, diff;

        while (itA >= 0 || itB >= 0) {
            diff = (itA >= 0 ? aList.get(itA) : 0) - (itB >= 0 ? bList.get(itB) : 0) - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.add(diff);
            itA--;
            itB--;
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }

        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> multyBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(aList.size() + bList.size(), 0));

        for (int i = aList.size() - 1; i >= 0; i--) {
            for (int j = bList.size() - 1; j >= 0; j--) {
                int mul = aList.get(i) * bList.get(j) + result.get(i + j + 1);
                result.set(i + j + 1, mul % 10);
                result.set(i + j, result.get(i + j) + mul / 10);
            }
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }

    public static ArrayList<Integer> slashBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        if (b.getList().size() == 1 && b.getList().get(0) == 0) {
            throw new ArithmeticException("на ноль делить нельзя");
        }

        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> Slash = new ArrayList<>();

        for (int i = 0; i < aList.size(); i++) {
            Slash.add(aList.get(i));
            int count = 0;
            while (compare(new BigIntegerCustom(listToString(Slash)), b) >= 0) {
                Slash = minusBigInt(new BigIntegerCustom(listToString(Slash)), b);
                count++;
            }
            result.add(count);
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }

    private static int compare(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        if (aList.size() != bList.size()) {
            return aList.size() - bList.size();
        }
        for (int i = 0; i < aList.size(); i++) {
            if (!aList.get(i).equals(bList.get(i))) {
                return aList.get(i) - bList.get(i);
            }
        }
        return 0;
    }

    private static String listToString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num);
        }
        return sb.toString();
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }
}

