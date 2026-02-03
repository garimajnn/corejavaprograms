package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {

    // collection is the root interface in collection framework
    // which represents the group of objects and provide some comman methods like add,remove,size,
    // iterable to work with group of data.
    // It's implemented by interface by list,set,queue and their concreate classes
    // like arraylist,priorityQueue,hashset.
    // It  extends iterable interface.


    // List is the interface which keeps the items in insertion order
    // ArrayList
    // LinkedList
    // Stack ->push ,pop,peek
    // Vector

 // ArrayList vs LinkedList
   // --> insertion order
    //  --> read time
    // --> remove  time


   // thread safe
   // vector
   // synchronisedList
   // copyonwritearraylist
    // List<String> list = Collections.synchronizedList(new ArrayList<>());
//   CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();


 //   WHY WE DONT GET ERROR WHILE ITERATING THE LIST THROUGH ITERATOR AND REMOVING THE ELEMENT
//
//    Iterator’s remove(): Safe, because it updates the iterator’s expectedModCount to match the list’s modCount.
//    Direct list modification during iteration: Unsafe, because the iterator’s expectedModCount and the list’s modCount get out of sync, causing a CME.


    // remember CopyOnWriteArrayList ka remove method kaam ni krta,I should list ArrayList to remove element from iterator
    // CopyOnWriteArrayList mein list.remove() use kro to remove the element

       public static void main(String[] args) {
           List<Integer> list=new ArrayList<>();
                list.add(3);
                list.add(8);
                list.add(1);
                Iterator itr=list.iterator();
                while(itr.hasNext()){
                    int ele=(int)itr.next();
                    if(ele==3){
                        itr.remove();
                    }
                    System.out.println(ele);
                }
       }



}
