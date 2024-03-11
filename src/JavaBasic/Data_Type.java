package JavaBasic;

import java.util.Scanner;

public class Data_Type {
    public static void Bai1() {
        // Khởi tạo 2 biến a và b kiểu số nguyên
        int a = 6;
        int b = 2;
        // Tổng của 2 số nguyên
        int sum = a + b;
        System.out.println("Tổng của 2 số nguyên là: " + sum);

        // Hiệu của 2 số nguyên là
        int hieu = a - b;
        System.out.println("Hiệu của 2 số nguyên là: " + hieu);

        // Tổng của 2 số nguyên
        int tich = a * b;
        System.out.println("Tổng của 2 số nguyên là: " + tich);

        // Hiệu của 2 số nguyên là
        int thuong = a / b;
        System.out.println("Hiệu của 2 số nguyên là: " + thuong);
    }

    public static void Bai2() {
        // khởi tạo 2 biến chiều dài và chiều rộng của hình chữ nhật
        double chieudai, chieurong, P;

        // Sử dụng Scanner để nhập chiều dài và chiều rộng của hình chữ nhật từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        chieudai = scanner.nextDouble();

        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        chieurong = scanner.nextDouble();


        // Tính diện tích của hình chữ nhật
        P = chieudai * chieurong;
        System.out.println("Kết quả diện tích hình chữ nhật là: " + P);
    }

    public static void Bai3() {
        // Khởi tạo biến name
        String name;
        // Khởi tạo lớp Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi ký tự của bạn: ");
        name = scanner.nextLine();
        System.out.println("Chuỗi ký tự của bạn vừa nhập là : " + name);
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
                case 3: {
                    Bai3();
                    break;
                }
                default:
                    System.out.println("Không có bài tập nào phù hợp với sự lựa chọn của bạn! ");
            }

        }
        while (choice != 0);

    }
}
