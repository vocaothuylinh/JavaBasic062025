public class SwitchCase {
        public static void main(String[] args) {
            int number = 20;
            switch (number) {
                case 10:
                    System.out.println("10");
                   // break;
                case 20:
                    System.out.println("20");
                    //break;
                case 30:
                    System.out.println("30");
                   // break;
                default:
                    System.out.println("Not in 10, 20 or 30");
            }

            String browser = "Firefox";

            switch (browser) {
                case "Chrome":
                    System.out.println("Chrome");
                    break;
                case "Edge":
                    System.out.println("Edge");
                    break;
                case "Firefox":
                    System.out.println("Firefox");
                    break;// thoát khỏi trường hợp kiểm tra, không kiểm tra tiếp
                default:
                    System.out.println("Chrome mặc định");
            }
        }
    }
