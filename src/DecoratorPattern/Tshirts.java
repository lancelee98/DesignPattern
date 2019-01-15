package DecoratorPattern;

public class Tshirts extends Decorator {
    @Override
    public void Show() {
        System.out.print("T恤  ");
        super.Show();
    }
}
