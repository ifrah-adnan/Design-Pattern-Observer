package obs;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public interface Observable {
    void subscribe(Observer observer);
    void removeSubscribe(Observer observer);
    void notiyObservers();
}
