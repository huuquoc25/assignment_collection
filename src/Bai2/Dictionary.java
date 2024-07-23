package Bai2;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("---------MENU---------");
            System.out.println("Nhập từ bàn phím số bạn muốn chọn");
            System.out.println(
                    "1. Thêm từ vào từ điển\n"
                            +"2. Hiển thị từ cần tìm\n"
                            +"0. Thoát khỏi trương trình\n"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1){
                System.out.println("Nhập từ:"); String key = sc.nextLine();
                System.out.println("Nhập nghĩa của từ:"); String value = sc.nextLine();
                map.put(key,value);

            } else if (luaChon == 2) {
                System.out.println("Nhập từ cần tìm trong từ điểm:"); String key = sc.nextLine();
                System.out.println(map.get(key));
            }
        }while (luaChon != 0);
    }
}
