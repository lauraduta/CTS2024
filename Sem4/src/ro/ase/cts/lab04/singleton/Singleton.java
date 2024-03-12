package ro.ase.cts.lab04.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Singleton is doing something");
    }


    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }


}
