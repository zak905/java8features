package opencode.designpatterns.observer;

public class CoolingUnit implements Observer {
        int oilLevel;

	public CoolingUnit(int oilLevel){
		this.oilLevel = oilLevel;
	}
	
	public void update(int oilLevel){
		this.oilLevel = oilLevel;
		System.out.println(this.getClass().getSimpleName() + ": oil level changed to " + oilLevel);
	}

}
