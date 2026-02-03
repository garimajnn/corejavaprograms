package collection;

public class NullCase {

/*
* HashTable does not allow null keys and values?
* null key ->
* null.hashcode() ->  nullpointerexception
* null.get(4) yadi isne null store kra toh ambiguity aa jayege isliye hum null store ni krte
* and us time pr map.containsKey() bhi ni tha
* earlier developer used to find ways ki null pointer exception aaye hi nai
* isliye null keys values ni hote the
*
*
*
*
*
*
*
*
*
*
*
*
* ConcurrentHashMap null key value kyu ni store krta
* {3,null},{null,5}
* thread 1->map.containsKey(3)   // true
* thread1 -> map.get(3)  ->null
* thread2->map.remove(3)
* thread 3 ->mp.containsKey(3) ->false
* Ab amibuity aa jayega ki uske value null thi ya wo presnt ni hai abhi beech m delete hua ya values null thi
*
*
* and null key ko special treatment bhi ni milta ki  wo 0 index pr store ho jaye
*
*
*
*
* */
}
