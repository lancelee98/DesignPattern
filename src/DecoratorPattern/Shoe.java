package DecoratorPattern;

public class Shoe extends Decorator {
    @Override
    public void Show() {
        System.out.print("鞋  ");
        super.Show();
    }
}
