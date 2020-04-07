package main.java.dev.bahamonde.utils.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    public final List<Observer> observers = new ArrayList<>();

    public void regist(Observer observer) {
        this.observers.add(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

}
