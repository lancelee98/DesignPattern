package StrategyPattern;

public class CashReturn extends CashSuper {
    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;
    public CashReturn(String moneyConditon,String moneyReturn)
    {
        this.moneyCondition=Double.parseDouble(moneyConditon);
        this.moneyReturn=Double.parseDouble(moneyReturn);
    }
    @Override
    public double acceptCash(double money) {
        double result=money;
        if(money>=moneyCondition)
            result=money-(int)(money/moneyCondition)*moneyReturn;
        return result;
    }
}
