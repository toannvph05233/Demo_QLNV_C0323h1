import manager.ManagerNhanVien;
import model.NhanVien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManagerNhanVien managerNhanVien = new ManagerNhanVien();

    public static void main(String[] args) throws ParseException {
        while (true) {
            System.out.println("Quản Lý Nhân Viên");
            System.out.println("1. Hiển thị toàn nhân viên");
            System.out.println("2. Thêm Nhân Viên");
            System.out.println("3. Tính Lương");
            System.out.println("4. Sort");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerNhanVien.show();
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    menuLuong();
                    break;
                case 4:
                    managerNhanVien.sort();
                    break;
            }
        }
    }


    public static void menuLuong() {
        while (true) {
            System.out.println("1. Nhân viên FullTime");
            System.out.println("2. Nhân viên PartTime");
            System.out.println("3. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerNhanVien.tinhLuong(true);
                    break;
                case 2:
                    managerNhanVien.tinhLuong(false);
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void menuAdd() throws ParseException {
        while (true) {
            System.out.println("1. Nhân viên FullTime");
            System.out.println("2. Nhân viên PartTime");
            System.out.println("3. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    NhanVien nhanVien1 = managerNhanVien.createNV(true);
                    managerNhanVien.add(nhanVien1);
                    break;
                case 2:
                    NhanVien nhanVien2 = managerNhanVien.createNV(false);
                    managerNhanVien.add(nhanVien2);
                    break;
                case 3:
                    return;
            }
        }
    }
}
