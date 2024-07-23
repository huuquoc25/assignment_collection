package Bai7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm vào arr:");
        int soLuong = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < soLuong; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println("Hiển thị arr ban đầu:");
        System.out.println(arr);

        // Sử dụng một danh sách tạm thời để lưu các phần tử cần xóa
        ArrayList<Integer> toRemove = new ArrayList<>();

//        // Duyệt qua các phần tử trong danh sách
//        for (int i = 0; i < arr.size(); i++) {
//            int value = arr.get(i);
//            if ((value % 2) == 1) {
//                toRemove.add(value);
//            }
//        }
//
//        // Xóa các phần tử lẻ khỏi danh sách ban đầu
//        arr.removeAll(toRemove);
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if ((value % 2) == 1) {
                iterator.remove();
            }
        }

        System.out.println("Hiển thị arr sau khi lọc bỏ các số lẻ:");
        System.out.println(arr);
    }
}

