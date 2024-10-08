package buoi3;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TinhToanUIConsole {
	
	//biến , fields
	Scanner stdIn = null; //standard Input
	PrintWriter stdOut = null;
	//functions
	
	//constructors
	TinhToanUIConsole() //khởi tạo đối tượng
	{
		//khởi tạo đối tượng BuffreredReader
		stdIn = new Scanner(System.in);
		//khởi tạo đối tượng PrintWriter
		stdOut = new PrintWriter(new OutputStreamWriter(System.out));
		
	}
	void input() {
		int soThuNhat, soThuHai, tong;
		stdOut.print("Nhap vao so thu nhat:");
		stdOut.flush();
		soThuNhat = stdIn.nextInt();
		stdOut.print("Nhap vao so thu hai:");
		stdOut.flush();
		soThuHai = stdIn.nextInt();
		
		//gửi thông điệp message cho đối tượng PhepCong
		//khởi tạo đối tượng
		//Buoc 1 khai báo biến có tên là congRemote
		//có kiểu là PhepCong
		PhepCong congRemote = null;
		  //Buoc 2 - khở tạo đối tượng
		congRemote = new PhepCong(soThuNhat, soThuHai);
		//message gửi thông điệp
		tong = congRemote.cong();//
		
		//kêt qua
		stdOut.print("Tong la: " + tong);
		stdOut.flush();
		
	}

}
