package org.example;

import obs.*;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ObservableImpl observable=new ObservableImpl();
        ObserverImpl1 o1=new ObserverImpl1();
        ObserverImpl2 o2=new ObserverImpl2();

observable.subscribe(new Observer() {
    @Override
    public void update(Observable observable) {
        System.out.println("---------");
        System.out.println("REs "+((ObservableImpl)observable).getState());
        System.out.println("---------");

    }
});
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.setState(300);
        observable.notiyObservers();
        observable.setState(400);
        observable.removeSubscribe(o2);
        observable.setState(333);

    }
}