package Bai1;

import java.util.ArrayList;
public class Danhsach {
    private ArrayList<Student> danhSach;

    public Danhsach() {
        this.danhSach = new ArrayList<Student>();
    }

    public Danhsach(ArrayList<Student> danhSach) {
        this.danhSach = danhSach;
    }

    public void addStudent(Student sv){
        this.danhSach.add(sv);
    }

    public void showList(){
        for(Student sv : danhSach) {
            System.out.println(sv);
        }
    }
}
