public class java2205 {


    String address = "HCM"; // Biến toàn cục

    static String phone = "0352603306"; // biến static

    // Hàm thứ nhất
    public void sayHello() {
        int n = 10;         // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public void getinfor() {
       // System.out.println(n);// báo lỗi vì biến n được khai báo trong hàm sayhello, không thể gọi ở hàm khác.
    }

    public static void main(String[] args) {
        // cách thức để gọi 1 thành phần trong 1 class vào hàm bất kỳ.
        java2205 bien = new java2205();//gọi tên class, đặt tên cho class biến mới, để gọi 1 biến, hàm không thuộc static vào hàm static
        System.out.println(bien.address);//  in biến address không thuộc static( vì đã thông qua 1 class mới trong hàm này.

      //  System.out.println(address);// báo lỗi vì biến address không thuộc biến static nên không thể để trong hàm static được.
        System.out.println(phone);// biến phone gọi được vì biến này là static

        // khai báo biến
        int number = 123456;
        int number2 = 987;
        String name = "linh";
        String name2 = "hihi";

        // in giá trị của biến, gõ sout để show gợi ý code print biến
        System.out.println(number2);
        System.out.println(number2);
        System.out.println(name);
        System.out.println(name2);
// nhấn ctrl + alt + l để format code cho ngay ngắn.

    }
}
