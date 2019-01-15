package DecoratorPattern;
public class Client {
    public static void main(String[] args) {
        Person lancelee=new Person("lancelee");
        Pants pants=new Pants();
        Shoe shoe=new Shoe();
        Tshirts tshirts=new Tshirts();

        pants.Decorate(lancelee);
        shoe.Decorate(pants);
        tshirts.Decorate(shoe);

        tshirts.Show();
    }
}
