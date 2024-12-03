package buoi6.p2;

import buoi6.p1.DongVat;

public class Cho extends DongVat {
	
	 public String toString(){
	        return "Giong Loai: " + giongLoai;
	    }
	 
	 @Override
	 public void keu() {
		 //super.keu();//gọi lại hành vi kêu của cha
		 System.out.println("Cho sua gau gau ...");
	 }
}
