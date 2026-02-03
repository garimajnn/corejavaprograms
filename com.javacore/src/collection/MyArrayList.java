package collection;

import static java.lang.Math.max;

public class MyArrayList {
    private Object[] elements;
    public final  static int DEFAULT_SIZE=10;
    int size=0;
    private static Object[] DEFAULT_EMPTY_LIST={};
    private static Object[] DEFAULT_SIZE_EMPTY_LIST={};

    public MyArrayList(){

        elements=DEFAULT_EMPTY_LIST;
    }
    public MyArrayList(int size){
        if(size==0){
            elements=DEFAULT_SIZE_EMPTY_LIST;
        }
        elements=new Object[size];

    }

    public void add(int a){
        handlesize(size++);
    }
    public void handlesize(int minicapacity){
        int newcapacity=0;
        if(elements==DEFAULT_EMPTY_LIST){
            newcapacity=DEFAULT_SIZE;
        }
        if(elements==DEFAULT_SIZE_EMPTY_LIST){
            newcapacity=Math.max(1,minicapacity);
        }
        if(minicapacity<elements.length){
          return;
        }
        else{
            newcapacity=Math.max(minicapacity,elements.length+(elements.length)>>1);
        }



    }
}
