package Staticjava;

public class StaticInJava {

        int rollno;
        String name;
        String address;
        static String college = "Bưu Chính Viễn Thông";
        static String univer = "Pnv VN";

    // hàm có thông số, có trả về kết quả
    StaticInJava(int r, String n, String a) {
            rollno = r;
            name = n;
            address = a;
        }

    // Hàm không có tham số, không trả về kết quả
        void display() {
            System.out.println(rollno + " - " + name + " - "+ " " + address + " " + college + " " + univer);
        }


        public static void main(String args[]) {
            StaticInJava s1 = new StaticInJava(111, "Thông", "hcm");
            StaticInJava s2 = new StaticInJava(222, "Minh", "dn");


            s1.display();
            s2.display();
        }
}
