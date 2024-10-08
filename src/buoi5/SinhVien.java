package buoi5;

public class SinhVien {
	
	//fields
	int maSV;
	String hoTen;
	float diemLT;
	float diemTH;
	
	//functions - methods
	SinhVien(){
		maSV = 0;
		hoTen = null;
		diemLT = 0.0f;
		diemTH = 0.0f;
	}
	
	SinhVien(int _maSV, String _hoTen, float _diemLT, float _diemTH){
		maSV = _maSV;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
	}
	
	public String toString() {
		return "MSSV:" + maSV + "\nHo va ten SV: " + hoTen;
	}
	

}
