package ObserverPattern.Observer;

import ObserverPattern.Observable.StorckObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StorckObservable observable;

    public MobileAlertObserverImpl(String username,StorckObservable observable){
        this.username  = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageToMobile(username,"Product is in the stock.. Hurry up");
    }

    private void sendMessageToMobile(String username,String msg){
        System.out.println("Message sent to"+ username);
    }
}
