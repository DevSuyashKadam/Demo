enum ColdDrink{
	
	KF,KO,RC,FO;
}




public class EnumTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColdDrink[]b=ColdDrink.values();
		for(ColdDrink b1:b) {
			System.out.println(b1+"    "+b1.ordinal());
		}
	}

}
