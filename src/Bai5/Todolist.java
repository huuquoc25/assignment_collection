package Bai5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {
        List<String> toDoList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhiệm vụ muốn thêm vào toDoList");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập công việc thứ "+(i+1)+": ");
            String task = sc.nextLine();
            toDoList.add(task);
        }
        System.out.println("Danh sách các công việc: ");
        System.out.println("\t"+toDoList+"\n");
    }
}
