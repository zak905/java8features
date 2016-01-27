package opencode.designpatterns.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngineOil oil = new EngineOil();
		//No observer yet
		oil.setLiquidLevel(50);
		
		//Adding new observers
		CarEngine engine = new CarEngine(oil.getLiquidLevel());
		oil.register(engine);
		
		CoolingUnit unit = new CoolingUnit(oil.getLiquidLevel());
		oil.register(unit);
		
		CarDashboard board = new CarDashboard(oil.getLiquidLevel());
		oil.register(board);
		
		//changing the level
		
	
		oil.setLiquidLevel(45);
		oil.setLiquidLevel(25);
		oil.setLiquidLevel(20);

	}
}
