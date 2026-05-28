package designpatterns.structural.decorator;


// The main interface
interface Notifier {
    void send(String message);
}

// Basic notifier (sends email)
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

// Decorator base class
class NotifierDecorator implements Notifier {
    protected Notifier wrappee;
    public NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }
    public void send(String message) {
        wrappee.send(message);
    }
}

// SMS Decorator
class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        super.send(message); // send previous notifications
        System.out.println("Sending SMS: " + message);
    }
}

// Facebook Decorator
class FacebookDecorator extends NotifierDecorator {
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }
    public void send(String message) {
        super.send(message); // send previous notifications
        System.out.println("Sending Facebook: " + message);
    }
}

// Usage

public class Decorator{
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier(); // just email
        notifier = new SMSDecorator(notifier);   // email + SMS
        notifier = new FacebookDecorator(notifier); // email + SMS + Facebook
        notifier.send("Your house is on fire!");
    }

}
