public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        double d, e, f;
        d = e = f = 0;

        //Toán Tử số học

        System.out.println("a / b = " + (a / b)); // a chia b
        System.out.println("a % b = " + (a % b)); // lấy phần dư phép tính a chia b
        System.out.println(a++); // a = a + 1, cái biến này đang tăng cộng 1 thôi nên in ra vẫn chưa ra giá trị sau cộng
        System.out.println("a++ = " + a); // a = 11
       // System.out.println(a += 5); // a = a + 5
        System.out.println("a +=5 = "+ (a +=5)); // a = 16

        // Toán tử so sánh và logic
        System.out.println("so sánh a > b: " + (a > b));
        System.out.println("so sánh a != b: " + (a != b));

        System.out.println((a > b) && (b > c));// so sánh and, nếu 1 cái false sẽ là false
        System.out.println((a > b) || (b > c)); // so sánh or, nếu 1 cái true sẽ là true

        System.out.println(((a < b) && (b > c)) || ((a < b) && (a < c)));// True, vì and 1 là true, and 2 là false, Or ở giữa nên là true


    }
}
