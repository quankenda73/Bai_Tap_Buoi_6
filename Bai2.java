package BT_Buoi_6;

public class Bai2 {
     
     public static int maxInArray(int[] arr) {
        
        if (arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng");
        }
        
        int max = arr[0];  
        
       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  
                max = arr[i];    
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
    
        int[] arr = {5, 8, 2, 10, 3, 6};
        int result = maxInArray(arr);
        System.out.println("Số lớn nhất trong mảng là: " + result);
    }
}
