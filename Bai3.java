package BT_Buoi_6;
public class Bai3 {

    public static int CountOccurrences(int[] arr, int elementToFind) {
        int count = 0;
        
        for (int num : arr) {
            if (num == elementToFind) { 
                count++;               
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 2, 8, 2, 4, 2};
        int element = 2;
        int result = CountOccurrences(arr, element);
        System.out.println("Số lần xuất hiện của phần tử " + element + " trong mảng là: " + result);
    }
}
