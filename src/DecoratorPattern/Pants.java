package DecoratorPattern;

public class Pants extends Decorator {
    @Override
    public void Show() {
        System.out.print("裤子  ");
        super.Show();
    }
}
