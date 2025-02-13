package WithObserverPattern.Subject;
import WithObserverPattern.Observer.Observer;

public interface Subject{
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}