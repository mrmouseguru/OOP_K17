package buoi14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RuntimeExceptionDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner keyboardInput = null;
		try {
			keyboardInput.nextLine();	
			System.out.println("Phia sau ngoai lệ ...");
		}catch(ArithmeticException nullEx) {
			System.out.println("Có ngoại lệ xảy ra ArithmeticException ...");
		}catch(NullPointerException nullEx2) {
			System.out.println("Có ngoại lệ Nullpointer Ex ...");
		}
		
		System.out.println("Done!!!");
		
		//checked exception
		SimpleDateFormat simpleDateFormat = null;
		try {
			simpleDateFormat.parse("01/01/2000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
