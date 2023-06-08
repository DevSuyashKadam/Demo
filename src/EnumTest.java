
enum Braverages{
	KF,KO,RC,FO;
}


/*
 * Enum concept introduced in 1.4 version
 * When comapred with old languages enum java s more powerful
 * By using enum we can define our own data types which are also come enumerated data types
 * 
 * 
 * Internally enum are implemented by using class concept
 * Every enum constsnt are is a refernce variable to that enum type object
 * 
 * every enum constant is implicitly public static final always
 * 
 * Ineritance concept is not applicable for enum explicitly
 */



public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Braverages b1=Braverages.RC;
		switch(b1) {
		
		
		case KF:
			System.out.println("It is healthy");
		break;
		
		case KO:
			System.out.println("It is too unhelthy");
		break;
		
		case RC:
			System.out.println("It is too hot");
		break;
		
		case FO:
			System.out.println("buy one got one");
		break;
		
		default:
			System.out.println("other braverages are not good for health");
		
		
		}
	}

}
