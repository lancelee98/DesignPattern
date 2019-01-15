package DecoratorPattern;

public class Person {
    public  Person(){}
    private String name;
    public Person(String name)
    {
        this.name=name;
    }
    public void Show()
    {
        System.out.println("装扮的会吃喝拉撒的"+name);//核心功能
    }
}
