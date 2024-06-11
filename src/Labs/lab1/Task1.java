package Labs.lab1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 3, 3, 1};

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (int num : arr){
            if (map.get(num) % 2 == 0){
                result.append(num).append(" ");
            }
        }
        System.out.println(result.toString().trim());
        
    }
}
