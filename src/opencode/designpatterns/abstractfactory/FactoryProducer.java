package opencode.designpatterns.abstractfactory;

public class FactoryProducer {
	
	
	public static AbstractFactory getFactory(String factoryType){
		
		if(factoryType.equals("Engine")){
			
			return new EngineFactory();
			
		}else if (factoryType.equals("Gear")){
			return new GearFactory();
			
		}
		return null;
		
		
	}

}
