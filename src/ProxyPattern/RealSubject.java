package ProxyPattern;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("Real Request");
    }
}
