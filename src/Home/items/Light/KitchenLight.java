package Home.items.Light;

import Home.Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class KitchenLight extends Light {
    private List<Observer> observers = new ArrayList<Observer>();

    public KitchenLight() {
        super();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void On() {
        super.isOn = true;
        for (Observer observer : observers) {
            observer.update(true);
        }
    }

    @Override
    public void Off() {
        this.isOn = false;
        for (Observer observer : observers) {
            observer.update(false);
        }
    }
}
