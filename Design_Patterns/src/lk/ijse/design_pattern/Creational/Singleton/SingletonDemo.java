package lk.ijse.design_pattern.Creational.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
