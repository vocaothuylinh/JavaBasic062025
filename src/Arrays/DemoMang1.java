package Arrays;

public class DemoMang1 {
    public static void main(String[] args) {

        //Khai báo mảng rỗng chưa mang giá trị
        int number1[] = new int[6];

        //gán giá trị cho mảng
        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 40;
        number1[4] = 50;
        number1[5] = 60;

        System.out.println("độ dài mảng: " + number1.length);

        // Duyệt mảng để lấy giá trị ra
        // For đơn giản
        for(int i = 0; i < number1.length; i++){
            System.out.println(number1[i]);
        }
        System.out.println("=====================================");
        
        for(int i = 2; i < 5; i++){
            System.out.println(number1[i]);
        }
        System.out.println("=====================================");
        // for cải tiến
        for (int number : number1){
            System.out.println(number);
        }
    }
}
