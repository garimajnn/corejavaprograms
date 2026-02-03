package designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    String channelName;
    public YoutubeChannel(String channelName){
        this.channelName=channelName;
    }
   List<Observer> subscriberList=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
         subscriberList.remove(observer);
    }

    public void uploadVideo(String url){
    for(Observer  subscriber:subscriberList){
        subscriber.notified(url,this.channelName);
    }
    }

}
