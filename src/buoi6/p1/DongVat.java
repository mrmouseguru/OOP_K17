package buoi6.p1;

public abstract class DongVat {
	  // instance variables - replace the example below with your own
    protected String giongLoai;  
    protected boolean gioiTinh;
    protected int tuoi;
    protected float canNang;

    /**
     * Constructor for objects of class DongVat
     */
    public DongVat()
    {
        // initialise instance variables
       
    }
    
    public DongVat(String _giongLoai, boolean _gioiTinh, int _tuoi, float _canNang){
        giongLoai = _giongLoai;
        gioiTinh = _gioiTinh;
        tuoi = _tuoi;
        canNang = _canNang;
        
    }
    
    //phuong thức cụ thể - concrete method
    public void an(){
        System.out.println("Dong Vat An ...");
    }

    public void ngu(){
        System.out.println("Dong Vat Ngu...");
    }

    //phương thức trừu tượng 
    public abstract void  keu();
        
}
