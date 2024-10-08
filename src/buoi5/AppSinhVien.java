package buoi5;

import java.util.Scanner;

public class AppSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		SinhVien sv1 = new SinhVien(1111, "Le Van Teo", 5.5f, 9.5f);
		SinhVien sv2 = new SinhVien(2222, "Le Van Ty", 7.5f, 5.5f);
		
		System.out.println(sv1);
		System.out.println(sv2);
		//Sinh vien 3
		SinhVien sv3 = new SinhVien();
		System.out.print("Nhap ma so SV:");
		sv3.setMaSV(input.nextInt());
		input.nextLine();
		System.out.print("Nhap ten SV:");
		sv3.setHoTen(input.nextLine());
		
		System.out.println(sv3);

	}

}
