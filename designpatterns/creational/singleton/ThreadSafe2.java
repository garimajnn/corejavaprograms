package designpatterns.creational.singleton;

// Double-Checked Locking
public class ThreadSafe2 {
    private static ThreadSafe2 instance;
    private ThreadSafe2(){

    }
    // good way of achieving the thread safety
    public static ThreadSafe2 getInstance(){

        if(instance==null){
            // t1,t2,t3
            synchronized(ThreadSafe2.class){
                // so that only one object get created
                if(instance==null)
                {instance=new ThreadSafe2();}
            }
        }
        return instance;
    }
}
