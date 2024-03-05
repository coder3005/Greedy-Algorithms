// Kth largest odd number in a given range

public class solution {
    public static int kthlargestnumber(int L, int R, int K) {
        int count = (R - L) / 2; // Count of odd numbers in the range
        if(R%2!=0 || L%2!=0) {
            count+=1;
        }
        else {
            count+=0;
        }

        if (K > count) { // If K is greater than the count of odd numbers
            return 0;
        } else {
            return R - 2 * (K - 1); // Compute the Kth largest odd number
        }
    }
    public static void main(String[] args) {
        System.out.println(kthlargestnumber(-3, 3, 1));
    }
}
