public class SwitchCase2 {
    public static void main(String[] args) {

        String browser = "Chrome";

        //Hàm toLowerCase dùng để chuyển chuỗi về chữ thường
        // Hàm toUpperCase chuyển về chữ in hoa
        //Trim dùng để cắt đi khoảng trắng 2 đầu của chuỗi

        switch (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Chrome");
               // break;
            case "Edge":
                System.out.println("Edge");
               // break;
            case "Firefox":
                System.out.println("Firefox");
              //  break;// thoát khỏi trường hợp kiểm tra, không kiểm tra tiếp
            default:
                System.out.println("Chrome mặc định");
                //break;

            // kết quả hiển thị tất cả vì nó check điều kiện đầu tiên đã khớp, nhưng cái sau nó không check điều kiện nữa nên chỉ hiển thị thôi
            // đối với những điều kiện đầu tiên không khớp nó sẽ không hiển thị luôn.
        }
    }
}
