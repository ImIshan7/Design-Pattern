package lk.ijse.design_pattern.Creational.Singleton_Design;

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    SingletonObject(){

    }

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
