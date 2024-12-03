package buoi6;

import buoi6.p1.Bo;
import buoi6.p1.DongVat;
import buoi6.p2.Cho;
import buoi7.Cop;

public class AppDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bo bo1Remote = new Bo("Ha Lan", false, 2, 300, 2);
		bo1Remote.nhaiLai();
		bo1Remote.keu();
		
		//ĐA HÌNH
		DongVat dv1Remote = new Bo();
		dv1Remote.keu();
		//sử dụng biến tham chiếu có tên là dv1Remote kiểu class
		//cha DongVat để điều khiển đối tượng bò trong Heap 
		//thuộc kiểu của class con
		
//		DongVat dv1Remote = new Bo("Trung Quoc", false, 2, 500, 4);
//		
//		Bo bo2Remote = (Bo)dv1Remote;//ép kiểu
//		bo2Remote.nhaiLai();
		dv1Remote = new Cho();
		dv1Remote.keu();
		
		dv1Remote = new Cop();
		dv1Remote.keu();
		
		//
		
	}

}
