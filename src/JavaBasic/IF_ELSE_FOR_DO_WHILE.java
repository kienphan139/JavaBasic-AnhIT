package JavaBasic;

import java.util.Scanner;

public class IF_ELSE_FOR_DO_WHILE {
    //Bài tập  if_else
    public static void Bai1(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của n: ");
        n = scanner.nextInt();

        if(n % 2 == 0 ){
            System.out.println(n + " Là số chẳn");
        }
        else {
            System.out.println(n + " Là số lẻ");
        }
    }

    public static void Bai2() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        a = scanner.nextInt();

        System.out.println("Nhập giá trị của b: ");
        b = scanner.nextInt();

        if(a <= b){
            System.out.println( a + " <= " + b);
        }
        else{
            System.out.println(a + " => " + b);
        }
    }

    public static void Bai3(){
        int diem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm của học sinh");
        diem = scanner.nextInt();

        if(diem < 5 ){
            System.out.println("Học lực yếu");
        }else if(diem >= 5 && diem < 7){
            System.out.println("Học lực trung bình");
        }else if (diem >= 7 && diem <= 8 ){
            System.out.println("Học lực khá");
        } else if(diem > 8 ){
            System.out.println("Học lực giỏi");
        }
    }

    //Bài tập For
    public static void Bai4(){
        int i,n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị n: ");
        n = scanner.nextInt();

        // Vòng lặp For
        for (i=1 ;i<=n ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void Bai5(){
        int a,b,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        a = scanner.nextInt();
        System.out.println("Nhập giá trị b: ");
        b = scanner.nextInt();

        // Vòng lặp For
        for (i = a ;a<=b;a++){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    //Bài tập do_while
    public static void Bai6(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhạp giá trị n để tìm số chẵn: ");
        n = scanner.nextInt();

        do {
                if(n % 2 == 0){ // kiểm tra n nhập vào có phải là số chẵn không
                    System.out.print(n + " "); // in ra số chẳn phù hợp trong điều kiện if
                }
                n++; // Tăng giá trị n lên 1

        }while (n <= 100); // kiểm tra n với điều kiện while nếu đúng sẽ thực hiện tiếp tục hàm if nếu sai sẽ dừng chương trình
        System.out.println();
    }
    public static void Bai7(){
        int i,n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị n: ");
        n = scanner.nextInt();

        do {
            for(i = 0; i <= n; i++ ){
               if(i % 2 != 0){
                   sum += i;
               }
            }
            System.out.println("Tổng các số lẻ từ 0 đến " + n + " là: " + sum);
        }while (i <= 7);
    }
    public static void main(String[] args) {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số để tìm bài tập cần giải: ");
            choice = scanner.nextInt();
            switch (choice){
                case 0:{
                    System.out.println("Đã thoát chương trình!");
                    break;
                }
                case 1:{
                    Bai1();
                    break;
                }
                case 2:{
                    Bai2();
                    break;
                }
                case 3:{
                    Bai3();
                    break;
                }
                case 4:{
                    Bai4();
                    break;
                }
                case 5:{
                    Bai5();
                    break;
                }
                case 6:{
                    Bai6();
                    break;
                }
                case 7:{
                    Bai7();
                    break;
                }
                default: System.out.println("Không có bài tập nào phù hợp với giá trị của bạn, vui lòng nhập lại!!!");
            }
        }while (choice != 0);
    }
}
