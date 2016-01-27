package opencode.designpatterns.abstractfactory;

public class GasolineEngine extends Engine {

	@Override
	public void buildEngine() {
		System.out.println("Building Gasoline Engine");
		
	}

	@Override
	public void testEngine() {
		System.out.println("Testing Gasoline Engine");
		
	}

}
