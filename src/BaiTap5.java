import java.util.Scanner;
public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code nhập
		//Scanner
		//khai báo Biến có tên là input có kiểu dữ liệu là Scanner
		Scanner input;
		String name;
		//khởi tạo đối tượng scanner
		System.out.print("Input the name:");
		input = new Scanner(System.in);
		
		//nhập chuỗi tên "Tèo" -> Teo
		name = input.nextLine();//lưu "Teo" vào biến String
		
		//xuất
		System.out.print("Hello " + name);
	}

}
