public class XuLyChuoi {
    public static void main(String[] args) {
        String S1 = "Lorem Ipsum is simply dummy text of the printing";
        String S2 = "Lorem Ipsum has been the industry's ";

        //Chuỗi bắt đầu từ 0, tính khoảng trắng là 1 kí tự
        //Cắt chuỗi
        System.out.println(S1.substring(3));
        System.out.println(S1.substring(3, 5));
        System.out.println("================================");
        //ghép chuỗi
        System.out.println("Ghép 2 chuỗi: "+ S1 + " " + S2);
        System.out.println("================================");

        //Chuyển kiểu in hoa thường
        System.out.println("Chuyển sang kiểu dữ liệu thường: "+ S1.toLowerCase());// chữ thường
        System.out.println("Chuyển sang kiểu dữ liệu in Hoa: "+ S1.toUpperCase());//chữ in hoa

        System.out.println("================================");
        // Xóa kí tự khoảng trắng 2 đầu
        String S3 = "   Test automation   ";
        System.out.println("Xóa kí tự khoảng trắng 2 đầu: " + S3.trim());

        // độ dài chuỗi
        System.out.println("Độ dài chuỗi: "+ S3.length());

        //Tìm kiếm kí tự trong chuỗi
        System.out.println(S1.charAt(6));

        //So sánh chuỗi
        // so sánh bằng
        String S4 = "Test Automation";
        String S5 = "test automation";
        System.out.println(S4.equals(S5));

        //so sánh chứa
        System.out.println(S4.contains("Automation2"));

        //so sánh bỏ qua hoa thường
        System.out.println(S4.equalsIgnoreCase(S5));



    }
}
