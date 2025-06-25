package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoCollectionArrayList {
    public static void main(String[] args) {
        //khai báo kiểu dữ liệu arraylist
        //Được phép lưu nhiều giá trị trùng lặp
        // Nếu để khúc đầu List thì khúc sau bạn chọn stack hay arraylist đều được
        // Nếu khúc đầu để arraylist thì khúc sau phải là arraylist
        List<String> menu = new Stack<>();
        //ArrayList<String> menu2 = new ArrayList<>();


        // Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");

        //Xóa dữ liệu
        //menu.remove(3);

        // Cập nhật dữ liệu
        menu.add(3, "Task1222");

        menu.set(4,"Reports");

        //get giá trị theo chỉ mục
        System.out.println(menu.get(4));
        System.out.println("========================================");

        //kiểm tra dữ liệu
        System.out.println(menu.contains("Dashboard44"));

        System.out.println("========================================");
        // duyệt kiểu dữ liệu arraylist
        //for basic
        for(int i = 0;i < menu.size(); i++){
            System.out.println(menu.get(i));
        }
        System.out.println("========================================");
        //For cải tiến
        int j =0;
        for (String value:  menu){
            System.out.println(menu.get(j));
            j++;
        }
        System.out.println("*********************************************");

        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu);// thêm nguyên bộ menu vào menu2
        for(int i = 0;i < menu2.size(); i++){
            System.out.println(menu2.get(i));
        }

    }
}
