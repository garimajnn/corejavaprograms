//package designpatterns.creational.Builder.HttpStepRequestBuilder;
//
//public class StepBuilder implements Method,Url,Body{
//
//
//    private String url;
//    private String method;
//    private String body;
//
//    public Method Url(String url){
//        this.url=url;
//        return this;
//    }
//    public Body Method(String method){
//        this.method=method;
//        return this;
//    }
//    public HttpRequest.HttpRequestBuilder Body(String body){
//        this.body=body;
//        HttpRequest httpRequest;
//        httpRequest.url=this.url;
//        httpRequest.body=this.body;
//        httpRequest.method=this.method;
//        return new HttpRequest.HttpRequestBuilder(httpRequest);
//    }
//
//
//}
