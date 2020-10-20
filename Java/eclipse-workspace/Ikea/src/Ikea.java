
public class Ikea {
	
	public static void main(String[] args) {
		
		int randomNumber = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 2+1);
		
		switch(randomNumber) {
		case 1:
			System.out.println("Braunschweig");
			break;
		case 2:
			System.out.println("Hannover");
			break;
		default:
			System.out.println("Fehler");
		}
	}

}
