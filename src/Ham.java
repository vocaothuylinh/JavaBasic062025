public class Ham {

    public double sum;
    public double res;

    //Hàm không trả về kết quả
    public void cong2so(){
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }
    // Hàm có tham số, không có kết quả trả về
    public void cong2so(int number1, int number2){

        System.out.println(number1 + number2);
    }

    // Hàm có kết quả trả về
    public double nhan2so(){
        int a = 5;
        int b = 10;
        res = a * b;
        return res;
    }
    //Hàm có tham số, có kết quả trả về
    public int nhan3so(int a, int b, int c){

        return a * b * c;
    }
    public void loginCRM(){
        System.out.println("Navigate to url");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify login success");
    }
    public static void main(String[] args) {
    Ham ham = new Ham();
    ham.cong2so();
    ham.nhan2so();
    ham.cong2so(20,30);



      //System.out.println(ham.cong2so() + 5); //câu lệnh này lỗi vì cộng 2 số thuộc hàm không trả về kết quả
      System.out.println("Hàm nhân 2 số = " + (ham.nhan2so() + 20));// câu này đúng vì nhan 2 số thuộc hàm trả về kết quả
      System.out.println("hàm nhân 3 số = " + ham.nhan3so(2, 2, 2)/2);
    ham.loginCRM();
    }
}
