package designpatterns.creational.Builder.HttpStepRequestBuilder;

import designpatterns.creational.Builder.HttpRequest;

public interface Body {
    HttpRequest.HttpRequestBuilder getBody(String body);
}
