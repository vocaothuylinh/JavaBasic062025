package DieuKienIfElse;

public class DemoIfElseIf {
    public static void main(String[] args) {
        double dtb = 2;

        if (dtb > 10 || dtb < 0) {
            System.out.println("giá trị không hợp lệ");
        }else{
            if(dtb >= 8 && dtb <= 10){
                System.out.println(" Học sinh giỏi");
            }else if(dtb < 8 && dtb >= 6.5) {
                System.out.println("học sinh khá");
            }else if(dtb < 6.5 && dtb >= 5 ){
                System.out.println("học sinh trung bình");
            } else if(dtb < 5 && dtb >= 3.5){
                System.out.println("học sinh yếu");
            }else {
                System.out.println("ở lại lớp");
            }
        }

    }
}
