package opencode.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EngineOil implements Subject {
	
	List<Observer> observers;
	
	int oilLevel;

	
	public EngineOil(){
	observers = new ArrayList<Observer>();
	}
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		observers.remove(index);
	}
	public void notifyObserver() {
		for(Observer observer:observers){
			observer.update(oilLevel);
		}
	}
	public void setLiquidLevel(int oilLevel){
		this.oilLevel = oilLevel;
		notifyObserver();
	}
	
	public int getLiquidLevel(){
		return this.oilLevel;
	}
}
