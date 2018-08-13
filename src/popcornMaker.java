
public class popcornMaker {
	public static void main (String [] args) {
		Microwave micro = new Microwave();
		Popcorn pop = new Popcorn("Gwakky");
		micro.putInMicrowave(pop);
		micro.setTime(9001);
		micro.startMicrowave();
	}
}
