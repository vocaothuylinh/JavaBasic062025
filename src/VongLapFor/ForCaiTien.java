package VongLapFor;

public class ForCaiTien {
    public static void main(String[] args) {
        int arr[] = { 20, 50, 40, 12, 16, 55 };
        for (int i : arr){
            System.out.println(i);
        }

        String menu[] = {"Dashboard", "Customer", "Project", "Task"};
        for (String menuname : menu){
            System.out.println(menuname);
        }
    }
}
