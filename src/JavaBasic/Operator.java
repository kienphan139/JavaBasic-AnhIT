package JavaBasic;

import java.util.Scanner;

public class Operator {
    public static void Bai1() {
        // Khởi tạo 2 biến
        String ten;
        int tuoi, tuoiSau15Nam;
        // Khởi tạo Scanner và nhập tên tuổi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên: ");
        ten = scanner.nextLine();

        System.out.println("Vui lòng nhập tuổi hiện tại của bạn: ");
        tuoi = scanner.nextInt();

        // Tính tuổi sau 15 năm
        tuoiSau15Nam = tuoi + 15;
        System.out.println("Tuổi hiện tại của " + ten + " là: " + tuoi);
        System.out.println("Tuổi của " + ten + " sau 15 năm là: " + tuoiSau15Nam);
    }

    public static void Bai2() {
        // Khởi tạo 2 biến số nguyên
        int a, b,temp;
        // Khởi tạo Scanner và nhập dữ liệu vào 2 biến số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập giá trị biến a: ");
        a = scanner.nextInt();

        System.out.println("Vui lòng nhập giá trị biến b: ");
        b = scanner.nextInt();

        System.out.println("Giá trị của a 'trước' khi hoán đổi: " + a);
        System.out.println("Giá trị của b 'trước' khi hoán đổi: " + b);
        //Hoán đổi giá trị của 2 số nguyên a và b
        temp = a;
        a = b;
        b = temp;

        System.out.println("Giá trị của a 'sau' khi hoán đổi: " + a);
        System.out.println("Giá trị của b 'sau' khi hoán đổi: " + b);
    }

    public static void main(String[] args) {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số để tìm bài tập cần giải: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0: {
                    System.out.println("Đã thoát chương trình!");
                    break;

                }
                case 1: {
                    Bai1();
                    break;

                }
                case 2: {
                    Bai2();
                    break;

                }
                default:
                    System.out.println("Không có bài tập nào phù hợp với giá trị của bạn, vui lòng nhập lại!!!");
            }
        } while (choice != 0 );

    }

}
