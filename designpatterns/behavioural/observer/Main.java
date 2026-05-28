package designpatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Observer observer1=new Subscriber();
        Observer observer2=new Subscriber();
        Observer observer3=new Subscriber();
        Observer observer4=new Subscriber();

        Subject subject=new YoutubeChannel("Vidhyansh");
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);
        subject.subscribe(observer4);

        subject.uploadVideo("https//uploadvideo");



    }
}
