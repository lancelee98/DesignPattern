package SimpleFactoryPattern;

public class Client {

    public static void main(String[] args) {
        Operation operationAdd;
        operationAdd=OperationFactory.createOperate("+");
        operationAdd.setNumberA(5);
        operationAdd.setNumberB(2);
        System.out.println("5+2="+operationAdd.GetResult());
        Operation operationMul;
        operationMul=OperationFactory.createOperate("*");
        operationMul.setNumberB(2);
        operationMul.setNumberA(5);
        System.out.println("5*2="+operationMul.GetResult());
    }
}
