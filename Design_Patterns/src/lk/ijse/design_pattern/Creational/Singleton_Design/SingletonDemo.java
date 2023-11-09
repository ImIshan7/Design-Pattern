package lk.ijse.design_pattern.Creational.Singleton_Design;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
