package opencode.designpatterns.abstractfactory;

public class EngineFactory extends AbstractFactory {

	@Override
	Engine getEngine(String engineType) {
		
		
		if(engineType.equals("Diesel")){
			
			return new DieselEngine();
			
		}else if(engineType.equals("Gasoline")){
			return new GasolineEngine();
		}
		return null;
	}

	@Override
	Gear getGear(String gearType) {
		//Not needed for Engine
		return null;
	}

}
