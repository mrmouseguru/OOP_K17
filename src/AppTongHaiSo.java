import java.util.Scanner;

public class AppTongHaiSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soThuNhat; int soThuHai;
		int tong = 0; int hieu = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so thu nhat:");
		soThuNhat = sc.nextInt();
		System.out.print("Nhap vao so thu hai:");
		soThuHai = sc.nextInt();
		
		//tong = soThuNhat + soThuHai;
		tong = cong(soThuNhat, soThuHai);
		
		hieu = tru(soThuNhat, soThuHai);
		//in ket qua
		System.out.println("Ket qua  tong: " + tong);
		System.out.println("Ket qua  hieu: " + hieu);

	}
	
	static int cong(int a, int b) {
		return a + b;
	}
	
	static int tru(int a, int b) {
		return a - b;
	}

}
