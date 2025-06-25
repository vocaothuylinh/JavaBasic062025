package Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //khai báo kiểu dữ liệu Map
        // Không lưu được 2 key trùng lặp
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        //Thêm dữ liệu
        map1.put("Language", "Java");
        map1.put("Framework", "TestNG");
        map1.put("Library", "Selenium");
        map2.put(20, 30.0);
        map2.put(40, 50.0);
        map2.put(60, 70.0);

        //Update dữ liệu
        map1.put("Library", "Selenium22");

        // In dữ liệu ra
        System.out.println("Map 1:" + map1);
        System.out.println("Map 2:" + map2);

        System.out.println("=================================");
        // Kiểm tra xem trong dữ liệu có chứa key và value như bên dưới hay ko
        System.out.println(map1.containsKey("Language11"));
        System.out.println(map1.containsValue("TestNG11"));
       //map1.remove("Library");

        System.out.println("=================================");
        //Duyệt kiểu dữ liệu Map
        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("=================================");

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
