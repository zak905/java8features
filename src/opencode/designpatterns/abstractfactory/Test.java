package opencode.designpatterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		
		AbstractFactory engineFactory = FactoryProducer.getFactory("Engine");
		AbstractFactory gearFactory = FactoryProducer.getFactory("Gear");
		
		Engine dieselEngine = engineFactory.getEngine("Diesel");
		Engine gasolineEngine = engineFactory.getEngine("Gasoline");
		
		Gear manualGear = gearFactory.getGear("Manual");
		Gear automaticGear = gearFactory.getGear("Automatic");
		
		Car car1 = new Car(dieselEngine, manualGear);
		Car car2 = new Car(gasolineEngine, automaticGear);
		
		car1.assemble();
		car1.test();
		
		car2.assemble();
		car2.test();

	}

}
