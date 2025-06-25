import java.util.LinkedHashMap;
import java.util.Map;

public class Problem_4 {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Create a map to store counts of multiples
        Map<Integer, Integer> multipleCounts = new LinkedHashMap<>();

        // Initialize counts for numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            multipleCounts.put(i, 0);
        }

        // Count how many numbers are divisible by 1 to 9
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multipleCounts.put(i, multipleCounts.get(i) + 1);
                }
            }
        }

        // Print output in required format
        System.out.println("Output:");
        System.out.print("{");
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : multipleCounts.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count < multipleCounts.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
