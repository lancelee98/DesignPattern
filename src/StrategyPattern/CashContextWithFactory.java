package StrategyPattern;

/**
 * 策略与工厂结合
 */
public class CashContextWithFactory {
    private CashSuper cashSuper;
    public CashContextWithFactory(String conditon)
    {
        switch (conditon)
        {
            case "正常收费":
                this.cashSuper=new CashNormal();break;
            case  "八折":
                this.cashSuper=new CashRebate("0.8");break;
            case "满200减100":
                this.cashSuper=new CashReturn("200","100");break;
        }
    }
    public double getReslut(double money)
    {
        return cashSuper.acceptCash(money);
    }
}
