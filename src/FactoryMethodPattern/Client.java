package FactoryMethodPattern;
public class Client {
    public static void main(String[] args) {
        IFactory iFactory=new AddFactory();//Add
//        IFactory iFactory=new MulFactory();//Mul
        Operation operationAdd=iFactory.CreateOperation();
        operationAdd.setNumberA(5);
        operationAdd.setNumberB(2);
        System.out.println("结果为"+operationAdd.GetResult());
    }
}
