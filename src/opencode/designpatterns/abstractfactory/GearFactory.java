package opencode.designpatterns.abstractfactory;

public class GearFactory extends AbstractFactory {

	@Override
	Engine getEngine(String engineType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Gear getGear(String gearType) {
		// TODO Auto-generated method stub
		if(gearType.equals("Manual")){
			return new ManualGear();
		}else if(gearType.equals("Automatic")){
			return new AutomaticGear();
		}
		return null;
	}

}
