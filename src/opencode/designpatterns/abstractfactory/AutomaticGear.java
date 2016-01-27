package opencode.designpatterns.abstractfactory;

public class AutomaticGear extends Gear {

	@Override
	public void buildGear() {
		System.out.println("Attaching Automatic Gear");
		
	}

	@Override
	public void testGear() {
		System.out.println("Testing Automatic Gear");
		
	}

}
