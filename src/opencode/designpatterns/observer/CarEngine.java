package opencode.designpatterns.observer;


public class CarEngine implements Observer {
	int oilLevel;
	public CarEngine(int oilLevel){
		this.oilLevel = oilLevel;
	}
	
	public void update(int oilLevel){
		this.oilLevel = oilLevel;
		System.out.println(this.getClass().getSimpleName() + ": oil level changed to " + oilLevel);
	}

}
