package buoi14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocFileText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chuẩn bị 1 file
		File fileText = new File("data.txt");
		
		try {
			//tạo ra một đối tượng có khả năng đọc fileText
			FileReader fileReader = new FileReader(fileText);
			
			//đối tượng đọc file tốt - an toàn
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
			//
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Có ngoai lệ: " + e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done!!!");
	}

}
