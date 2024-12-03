package buoi13;

public class Vit {
	
	 // instance variables - replace the example below with your own
    private float size;
    private String color;
    private static int count = 0;

    /**
     * Constructor for objects of class Vit
     */
    public Vit()
    {
        count++;
       
    }


    public void keu()
    {
        System.out.println("Quac Quac ....");
    }
    
    public static int getCount() {
    	return count;
    }

}
