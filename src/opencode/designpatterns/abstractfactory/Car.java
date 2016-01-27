package opencode.designpatterns.abstractfactory;

public class Car {
	
	Engine engine;
	Gear gear;
	
	public Car(Engine engine, Gear gear){
		this.engine = engine;
		this.gear = gear;
	}
	
	public void assemble(){
		System.out.println("-----------Starting car assembly");
		engine.buildEngine();
		gear.buildGear();
		System.out.println("-----------car assembly done");
	}
	
	public void test(){
		System.out.println("-----------Starting car tests");
		engine.testEngine();
		gear.testGear();
		System.out.println("-----------car tests done");
		
	}

}
