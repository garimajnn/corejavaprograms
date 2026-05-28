package designpatterns.creational.singleton.breakpattern.cloning;
    public class Singleton implements Cloneable {
        private static Singleton instance;
        private Singleton() {
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        protected Object clone() {
//          return super.clone();
            return instance;
        }

    }
