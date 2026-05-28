package designpatterns.creational.Builder;

// here no setter will be there in parent class
// so that it guarantees immutability
public class HttpRequest {

    private  String url;
    private String method;
    private int timeout;
    private String header; // content type header
    private String queryParam;
    private String body; //

    private HttpRequest(HttpRequestBuilder builder){
        this.body= builder.body;
        this.header=builder.header;
        this.url=builder.url;
        this.timeout=builder.timeout;
        this.queryParam=builder.queryParam;
    }
    public static class  HttpRequestBuilder{
        private  String url;
        private String method;
        private int timeout;
        private String header; // content type header
        private String queryParam;
        private String body;


        public HttpRequestBuilder(){

        }
        public HttpRequestBuilder setUrl(String url){
            this.url=url;
            return this;
        }

        public HttpRequestBuilder setMethod(String method) {
            this.method = method;
            return this;
        }

        public HttpRequestBuilder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequestBuilder setHeader(String header) {
            this.header = header;
            return this;
        }

        public  HttpRequestBuilder setQueryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public HttpRequestBuilder setBody(String body) {
            this.body = body;
            return this;
        }
        public HttpRequest build(){

            // yaha pr main mere saare validation laga dungi
            // jiski wajha se validation will not be scattered

            if(this.url.isEmpty()){

                throw new IllegalArgumentException("url is empty");
            }
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return "Builder{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", timeout=" + timeout +
                ", header='" + header + '\'' +
                ", queryParam='" + queryParam + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

// constructor overloading se bach jayega agr koi field pass ni kre toh wo null ho jayege
// code mera tight coulping bhi ni ab pahele jaise
// immutability bhi hai
