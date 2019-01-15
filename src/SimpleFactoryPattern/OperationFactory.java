package SimpleFactoryPattern;

public class OperationFactory {
    public static Operation createOperate(String operate)
    {
        Operation oper=null;
        switch (operate)
        {
            case "+":
                oper=new OperationAdd();
                break;
            case "*":
                oper=new OperationMul();
                break;
        }
        return oper;
    }
}
