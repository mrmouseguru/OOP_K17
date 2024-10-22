package buoi6.p1;

public class Bo extends DongVat{
	private float khoiLuongSua;
	 public Bo()
	    {
	        // initialise instance variables
	    }
	 
	  public Bo(String _giongLoai, boolean _gioiTinh, int _tuoi, float _canNang, float _khoiLuongSua){
	        
	        super(_giongLoai, _gioiTinh, _tuoi, _canNang);
	        khoiLuongSua = _khoiLuongSua;
	        
	    }
	    
	    
	     public Bo(String _giongLoai)
	    {
	        // initialise instance variables
	        giongLoai = _giongLoai;
	    }
	    
	    
	    
	    public String toString(){
	        return "Giong Loai: " + giongLoai;
	    }
	    
	    public void nhaiLai() {
	    	System.out.println("Nhai lai....");
	    }
	    
	    @Override
	    public void keu() {
	    	System.out.println("bo keu um bo....");
	    	
	    }

}
