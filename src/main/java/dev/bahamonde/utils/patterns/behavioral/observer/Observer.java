package main.java.dev.bahamonde.utils.patterns.behavioral.observer;

public abstract class Observer {

    public Observer(Observable observable) {
        observable.regist(this);
    }

    protected abstract void update();

}
