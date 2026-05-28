package designpatterns.behavioural.observer;

public class Theory {

/**
 * whenever there is a change in one object and it need to be communicated to multiple other objects.
 * Now this one object is usually called as subject
 * And these multiple objects are called observers.
 * Or it can be called as publisher and subsribers/listers.
 *
 * */

/**
 * Example when there is a change in status of order of swiggy,zomoto,amazon
 * Or there is change in ride status in uber ola there might be multiple people who are viewing the
 * status of ride,
 * All of them who are viewing the status need to be notified  when status changes.
 * In such cases we can use observer design pattern.
 *
 * */

/**
 * 1.When we subscibe to particular news channel, we get notifications,
 * 2.It can also be used to run discount / promotions for specific product or when a few people have
 * subscribed to the newspaper
 *
 * */

/**
 * If we will not use observer design pattern , then hamare pass polling technique aate hai
 * jiske state change krne k wait krte hai usko subject bol dete hai
 * And jo state observer krenge doosre object ki  usko observer bolenge
 * One to many connection  hota hai observer nd observer mein
 *
 */

/***
 *
 * Agr hum observer pattern ko use ni krenge toh observer khud ja ja ke poochege
 * subject se ki tumhare value change hui kya...
 * But iske frequency ka ni pta har second jaayga, weekly ya kab kab jayega
 * So we will shift from polling to pushing
 * Pushing means - subject ki jab jab state change hogi toh uske subsciber ko pata chal jayega
 *
 */


}
