package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Danhsach ds = new Danhsach();
        int luaChon;
        do {
            System.out.println("---------MENU---------");
            System.out.println("Nhập từ bàn phím số bạn muốn chọn");
            System.out.println(
                     "1. Thêm sinh viên vào danh sách\n"
                    +"2. Hiển thị danh sách sinh viên\n"
                    +"0. Thoát khỏi trương trình\n"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1){
                System.out.println("Nhập tên của sinh viên"); String name = sc.nextLine();
                System.out.println("Nhập địa chỉ của sinh viên"); String address = sc.nextLine();
                System.out.println("Nhập tuổi của sinh viên"); int age = sc.nextInt();
                Student sv = new Student(name,address,age);
                ds.addStudent(sv);
            } else if (luaChon == 2) {
                ds.showList();
            }
        }while (luaChon != 0);
    }
}
