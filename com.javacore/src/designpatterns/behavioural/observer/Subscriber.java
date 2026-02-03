package designpatterns.behavioural.observer;

public class Subscriber implements Observer
{
  public void notified(String url,String channelName){

        System.out.println("Video uploaded " + url +"by" + channelName);
    }
}
