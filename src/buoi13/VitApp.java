package buoi13;

public class VitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vit vit3 = null;
		Vit vit1 = new Vit();
		Vit vit2 = new Vit();
		vit3 = vit1;
		System.out.println("So doi tuong vit: " + Vit.getCount());;
		
		vit1 = null;// đối tượng vịt trong Heap không còn được 
		//điều khiển bởi biến tham chiếu đối tượng vit1
		//Bộ thu gom rác của Java
		//JGC
		try {
			vit1.keu();

		}catch(Exception e) {
			
		}
		vit3.keu();

	}

}
