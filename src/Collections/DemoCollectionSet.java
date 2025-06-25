package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //khai báo kiểu dữ liệu SET
        // Không lưu được dữ liệu trùng lặp
        Set<String> menu = new HashSet<>();

        // Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");
        // Kiểm tra xem trong dữ liệu có chứa Tasks ko
        System.out.println(menu.contains("Tasks"));
        System.out.println(menu.contains("Tasks333"));
        // Xóa Sales
        menu.remove("Sales");
        //Đếm size của dữ liệu sau khi xóa
        System.out.println(menu.size());
        // Duyệt dữ liệu
        System.out.println("\n=================================");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + menu + "\n");
        System.out.println("\n=================================");
        // Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // Show set through for-each
        System.out.println("\n=================================");
        for (String obj : menu) {
            System.out.println(obj);
        }
    }
}
