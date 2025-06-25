package DieuKienIfElse;

public class DemoIf {
    public static void main(String[] args) {
        int age = 20;
        String address = "hcm";
        String header = "Login home page";

        // so sánh bằng trong chuỗi dùng hàm equals(), còn so sánh đối với số dùng ==
        // so sánh chứa trong chuỗi dùng hàm contains(), so sánh đối với số không có chứa
        if((age > 18) && address.equals ("hcm")) {

            System.out.println("được đi NVQS");
        }

        if (header.contains("Login")){
            System.out.println("Đã đến được trang Login");
        }
    }
}
