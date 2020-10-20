public class Kontrollstrukturen {
	
	public static void main(String[] args) {
		
		int randomNumber = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 10+1);
		int randomNumberConeSundae = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 2+1);
		String iceCream;
		
		
		//Switch-Case: Eissorte
		switch(randomNumber) {
		case 1:
			iceCream = "Cookie";
			break;
		case 2:
			iceCream = "Schokolade";
			break;
		case 3:
			iceCream = "Erdbeere";
			break;
		case 4:
			iceCream = "Stracciatella";
			break;
		case 5:
			iceCream = "Joghurt";
			break;
		default:
			iceCream = "Vanille";
			break;
		}
		
		//If: Waffel oder Becher mit/ohne Sahne
		if(randomNumberConeSundae == 1) {
			System.out.println(iceCream + " in der Waffel");
		}else {
			int randomNumberCream = java.util.concurrent.ThreadLocalRandom.current().nextInt(1,2+1);
			if(randomNumberCream == 1) {
				System.out.println(iceCream + " im Becher ohne Sahne");
			}else {
				System.out.println(iceCream + " im Becher mit Sahne");
			}
		}				
	}
}
