package xx;

public class object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ev myev = new ev();
		
		System.out.println(myev.getAddress());
		
		myev.setAddress("Istanbul");
		
		System.out.println(myev.getAddress());
		System.out.println(myev.getName());
		
		evBilgiShow(myev);
		
		// ev e2 = myev;
		
		System.out.println("Evin fiyati:"+hesapla(myev));
		
		myev.setAlan(200);
		myev.setOdaSay(6);
		System.out.println("Evin fiyati:"+hesapla(myev));
		
			
		

	}
	
	public static void evBilgiShow(ev e1) {
		
		System.out.println("Ben "+ e1.getName() + " i satin aldim.");
		System.out.println("O "+ e1.getAddress() + " da bulunur");
		System.out.println("ama ben onun adresini degistirmek istiyorum");
		e1.setAddress("Yomra");
		System.out.println("O simdi "+ e1.getAddress() + " da bulunur");
		
	}
	
	
	public static int hesapla(ev e1) {
		
		return e1.getAlan()*1000 + e1.getOdaSay()*10000;
	}
	

}
