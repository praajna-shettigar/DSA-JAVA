package ObserverPattern.Observer;

import ObserverPattern.Observable.StorckObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StorckObservable observable;

    public EmailAlertObserverImpl(String emailId,StorckObservable storckObservable){
        this.observable = storckObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in the stock");
    }

    private void sendEmail(String emailId,String body){
        System.out.println("Email sent to: " + emailId);
    }
}
