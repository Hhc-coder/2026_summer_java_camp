import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // System.out.println("numbers"+Arrays.toString(numbers));
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            if (max1 < numbers[i]){
                max2 = max1;
                max1 = numbers[i];
            }
        }
        System.out.println("max1 = "+max1);
        System.out.println("max2 = "+max2);
        return max1 * max2;
    }
}