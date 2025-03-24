package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StorckObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StorckObservable storckObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",storckObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",storckObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl( "qwerty",storckObservable);

        storckObservable.add(observer1);
        storckObservable.add(observer2);
        storckObservable.add(observer3);

        storckObservable.setStockCount(10);
        storckObservable.setStockCount(0);
        storckObservable.setStockCount(100);




    }
}
