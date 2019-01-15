package SimpleFactoryPattern;

public class Client {

    public static void main(String[] args) {
    Operation operation;
    operation=OperationFactory.createOperate("+");
    operation.setNumberA(5);
    operation.setNumberB(2);
    System.out.println("5+2="+operation.GetResult());
    operation=OperationFactory.createOperate("*");
    operation.setNumberB(2);
    operation.setNumberA(5);
    System.out.println("5*2="+operation.GetResult());
    }
}
