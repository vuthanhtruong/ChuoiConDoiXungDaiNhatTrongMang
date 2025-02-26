package code;
import java.util.Arrays;
public class SortTrunks {
    public static void main(String[] args) {
        int[] M = {0, 0, 100,5, 100, 8,7, 0, 5,0,99};
        sortTrunks(M);
        System.out.println(Arrays.toString(M));
    }
    public static void sortTrunks(int[] M) {
        int h = M.length;
        while (h > 1) {
            int test = M[0];
            int count = 0;  
            for (int i = 0; i < h; i++) {
                if (M[i] > test) {
                    test = M[i];
                    count = 1;  
                } else if (M[i] == test) {
                    count++; 
                }
            }
            int left = 0;
            for (int i = 0; i < h; i++) {
                if (M[i] != test) {
                    if (left != i) {
                        int temp = M[i];
                        M[i] = M[left];
                        M[left] = temp;
                    }
                    left++;
                }
            }
            h -= count;
        }
    }
}