package Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Storate storate = new Storate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm muốn thêm vào kho");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập tên sản phẩm thứ " +(i+1)+": ");String name = sc.nextLine();
            System.out.println("Nhập giá của 1 sản phẩm thứ "+(i+1)+": ");double price = sc.nextDouble();
            System.out.println("Nhập số lượng tồn kho của sản phẩm thứ"+(i+1)+": ");int quantity = sc.nextInt();
            sc.nextLine();
            Product sp = new Product(name,price,quantity);
            storate.addProduct(sp);
            System.out.println(" ");
        }
        System.out.println("Hiển thị danh sách sản phẩm trong kho:");
        storate.showStorage();
        System.out.println("Hiển thị danh sách sản phẩm trong kho theo giá tăng dần");
        storate.sortPrice();
        storate.showStorage();
    }
}
