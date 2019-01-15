package StrategyPattern;

public class CashContext {
    private CashSuper cashSuper;
    public CashContext(CashSuper cashSuper)
    {
        this.cashSuper=cashSuper;
    }
    public double getReslut(double money)
    {
        return cashSuper.acceptCash(money);
    }
}
