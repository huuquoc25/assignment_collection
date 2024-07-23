package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm vào mảng");
        int soPhanTu = sc.nextInt();
        for( int i=0;i<soPhanTu;i++){
            int phanTu = sc.nextInt();
            ds.add(phanTu);
        }
        System.out.println("Hiển thị danh sách ban đầu");
        for(int x : ds){
            System.out.print(x+" ");
        };

        System.out.println("\nHiển thị danh sách theo thứ tự tăng dần ");
        Collections.sort(ds, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    if (o1 == o2) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        for(int x : ds){
            System.out.print(x+" ");
        }
    }
}
