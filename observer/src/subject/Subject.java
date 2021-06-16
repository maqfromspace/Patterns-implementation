package subject;

import observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
    void deleteObserver(Observer observer);

}
