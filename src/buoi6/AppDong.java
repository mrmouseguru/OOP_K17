package buoi6;

import buoi6.p1.Bo;
import buoi6.p1.DongVat;

public class AppDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bo bo1Remote = new Bo("Ha Lan", false, 2, 300, 2);
		bo1Remote.nhaiLai();
		
		DongVat dv1Remote = new Bo("Trung Quoc", false, 2, 500, 4);
		
		Bo bo2Remote = (Bo)dv1Remote;//ép kiểu
		bo2Remote.nhaiLai();
	}

}
