package designpatterns.creational.Builder;

//If there are common ways to create objects (with certain fields set frequently),
// the Director helps automate and standardize that process.


//The Builder is still there for flexibility, so you can create custom objects as needed.


//The Director just makes it easier and less error-prone to create objects with
// common configurations, so you don’t have to repeat the same setup code everywhere.

public class HttpRequestDirector {

    private HttpRequest.HttpRequestBuilder builder;
    public HttpRequestDirector(HttpRequest.HttpRequestBuilder builder){
        this.builder=builder;
    }
    // build a simple get request
    public  HttpRequest  constructGetRequest(String url){

       return  builder.setUrl(url)
                      .setMethod("GET")
                      .setTimeout(5000)
                      .setHeader("Content-Type: application/json")
                      .build();

         }

    public HttpRequest constructPostRequest(String url,String body){

        return builder.setUrl(url)
                      .setHeader("Content_Type:application/json")
                      .setTimeout(10000)
                      .setBody(body)
                      .setMethod("POST")
                      .build();

    }

    public static void main(String[] args) {
        HttpRequest.HttpRequestBuilder builder = new HttpRequest.HttpRequestBuilder();
        HttpRequestDirector director=new HttpRequestDirector(builder);
        director.constructGetRequest("http://google.com");
        System.out.println(builder.build());

    }
}

