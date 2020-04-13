package main.java.dev.bahamonde.patterns.behavioral.observer;

public abstract class Observer {

    public Observer(Observable observable) {
        observable.regist(this);
    }

    protected abstract void update();

}
