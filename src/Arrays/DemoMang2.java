package Arrays;

import java.sql.SQLOutput;

public class DemoMang2 {
    public static void main(String[] args) {

        //khai báo và gán giá trị cho mảng
        int number2[] = {5, 10, 15, 20, 25, 30};

        number2[2] = 50;
        System.out.println("Length: "+number2.length);
        System.out.println(number2[4]);
        System.out.println("=============================");
        for (int i = 0; i < number2.length; i++){

            System.out.println(number2[i]);
        }
        System.out.println("=============================");

        String dataCustomer[] = {"Hoa", "Hồng", "Huệ"};
        System.out.println(dataCustomer[0]);
        System.out.println(dataCustomer[1]);
        System.out.println(dataCustomer[2]);

        System.out.println("=============================");
        for(int i = 0; i < dataCustomer.length; i++){
            if(dataCustomer[i].equals("Quân")) {
                System.out.println("Có Quân");

            }else{
                System.out.println("Thiếu Quân");
            }
        }
        System.out.println("=============================");

        boolean check = true;

        for(int i = 0; i < dataCustomer.length; i++){
            if(dataCustomer[i].equals("Linh")) {
                check = true;
                break;

            }else{
                check = false;
            }
        }
        if (check == true){
            System.out.println("Có bé Linh");
        }else{
            System.out.println("Linh đi chơi ròi");
        }

    }

}
