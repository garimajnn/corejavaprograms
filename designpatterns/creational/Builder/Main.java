package designpatterns.creational.Builder;

public class Main {
    public static void main(String[] args) {
        HttpRequest obj=new HttpRequest.HttpRequestBuilder()
                .setBody("Body")
                .setUrl("http://localhost::2121")
                .setHeader("content")
                .setQueryParam("garima")
                .setTimeout(211)
                .build();  // terminating method
        System.out.println(obj);


        // here my object will also be immutable
        // beeche k saare operation ko hum intermiediate methods bolte hai
        // here we are creating object very slowly

    }
}
