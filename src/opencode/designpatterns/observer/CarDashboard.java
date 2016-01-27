package opencode.designpatterns.observer;

public class CarDashboard implements Observer {


	int oilLevel;
	
	public CarDashboard(int oilLevel){
		this.oilLevel = oilLevel;
	}
	

	public void update(int oilLevel) {
		// TODO Auto-generated method stub
		this.oilLevel = oilLevel;
		System.out.println(this.getClass().getSimpleName() + ": oil level changed to " + oilLevel);
	}
}
