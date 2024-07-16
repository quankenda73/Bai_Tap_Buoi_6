package BT_Buoi_6;

public class ArrayBT {
    public static int SumEvenNumberArrays(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) { 
                sum += num;     
            }
        }
        return sum;
    }

    public static void main(String[] args) {
     
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = SumEvenNumberArrays(arr);
        System.out.println("Tổng các số chẵn trong mảng là: " + result);
    }
}
