/*This is Singleton class which is used to create
only one instance of the class and provide a global point of access to it.
* */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }
    public static synchronized  Singleton getInstance() {
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}

