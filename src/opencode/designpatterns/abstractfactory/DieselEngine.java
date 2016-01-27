package opencode.designpatterns.abstractfactory;

public class DieselEngine extends Engine {

	@Override
	public void buildEngine() {
		System.out.println("Building Diesel Engine");
	}

	@Override
	public void testEngine() {
		// TODO Auto-generated method stub
		System.out.println("Testing Diesel Engine");	
	}

}
