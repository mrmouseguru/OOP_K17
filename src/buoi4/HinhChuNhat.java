package buoi4;

public class HinhChuNhat {
	
	//fields - biến
	int chieuDai;
	int chieuRong;
	
	//methods - functions
	int tinhDienTich() {
		int dienTich;
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	
	int tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}

}
