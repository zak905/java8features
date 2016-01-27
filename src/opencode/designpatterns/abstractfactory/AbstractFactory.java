package opencode.designpatterns.abstractfactory;

public abstract class AbstractFactory {
	abstract Engine getEngine(String engineType);
	abstract Gear getGear(String gearType);
}
