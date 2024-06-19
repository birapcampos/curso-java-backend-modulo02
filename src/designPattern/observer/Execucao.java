package designPattern.observer;

public class Execucao {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("Estado 1");
        subject.setState("Estado 2");

        subject.removeObserver(observer1);

        subject.setState("Estado 3");
    }
}
