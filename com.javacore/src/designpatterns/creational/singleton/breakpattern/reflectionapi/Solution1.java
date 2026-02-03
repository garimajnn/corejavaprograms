package designpatterns.creational.singleton.breakpattern.reflectionapi;

public class Solution1 {


        private static Solution1 instance;
        private Solution1(){
            // solution to breakage of design principle
            if(instance!=null){
                throw new RuntimeException("You're trying to break the singleton principle");
            }

        }

        public static Solution1 getInstance() {
            if(instance==null){
                instance=new Solution1();
            }
            return instance;
        }
    }

