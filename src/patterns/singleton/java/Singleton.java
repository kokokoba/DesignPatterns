package patterns.singleton.java;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを作成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }

//    private static Singleton singleton = null;
//    private Singleton() {
//        System.out.println("インスタンスを作成しました");
//    }
//    public static Singleton getInstance() {
//        if(singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

}
