package designpatterns.creational.Builder.HttpStepRequestBuilder;

import java.util.Map;

public class HttpRequest {
     String url;
     String body;
     Map<String,String> content;
     String method;
     int timeout;
    public HttpRequest( ){

    }

    public static  class HttpRequestBuilder
    {
       public HttpRequest build(HttpRequest httpRequest){
           return httpRequest;
       }

    }
}
