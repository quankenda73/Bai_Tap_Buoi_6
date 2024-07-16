package BT_Buoi_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        SumOfSquaresElements(array);
    }

    public static void SumOfSquaresElements(ArrayList<Integer> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các giá trị vào mảng (nhập 'n' để kết thúc):");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                array.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập số nguyên hoặc 'n' để kết thúc.");
            }
        }
        
        int sumOfSquares = 0;
        for (int number : array) {
            sumOfSquares += number * number;
        }
        
        System.out.println("Tổng bình phương các phần tử trong mảng là: " + sumOfSquares);
    }
}
