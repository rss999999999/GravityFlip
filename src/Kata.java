import java.util.Arrays;
import static sun.security.util.ArrayUtil.reverse;

public class Kata {
    public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            Arrays.sort(arr);
        } else if (dir == 'L') {
            Arrays.sort(arr);
            reverse(arr);
        }
        return arr;
    }

    private static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (1 + i)];
            arr[arr.length - (1 + i)] = temp;
        }
    }
}
