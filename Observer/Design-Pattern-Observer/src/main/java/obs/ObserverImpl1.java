package obs;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl obs) {
            System.out.println("***********Impl 1*******");
            System.out.println("this is new value Impl " + obs.getState());
            System.out.println("******************");
        }

    }
}
