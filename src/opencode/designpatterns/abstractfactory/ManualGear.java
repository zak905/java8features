package opencode.designpatterns.abstractfactory;

public class ManualGear extends Gear {

	@Override
	public void buildGear() {
		System.out.println("Attaching Manual Gear");
		
	}

	@Override
	public void testGear() {
		System.out.println("Testing Manual Gear");
		
	}

}
