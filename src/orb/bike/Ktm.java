package orb.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("3133323");
				
	}

	@Override
	public void speed() {
		System.out.println("400rpm");
				
	}
	public static void main(String[] args) {
		Ktm a=new Ktm();
		a.cost();
		a.speed();
	}

}
