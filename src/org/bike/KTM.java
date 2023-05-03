package org.bike;

public class KTM implements Bike{

	@Override
	public void bike() {
		System.out.println("MODEL:YAMAHA R15");
		
	}
private void cost() {
	System.out.println("COST:1.6 lakhs");

}
private void speed() {
	System.out.println("SPEED:150km/hr");

}
public static void main(String[] args) {
	KTM k = new KTM();
	k.bike();
	k.cost();
	k.speed();
}
}
