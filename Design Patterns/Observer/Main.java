import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer interface
interface Observer {
    void update();
}

// Concrete Observer
class ConcreteObserver implements Observer {
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("State updated: " + subject.getState());
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new ConcreteObserver(subject); // Attach observer

        subject.setState(10); // Output: State updated: 10
        subject.setState(20); // Output: State updated: 20
    }
}