package obs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeSubscribe(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notiyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }


    }

    public void setState(int state) {
        this.state = state;
        this.notiyObservers();
    }
    public int getState(){
        return this.state;
    }

}
