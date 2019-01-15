package StrategyPattern;

public class Client {
    public static void main(String[] args) {
        String conditon="";
        double money=900;
//        conditon="正常收费";
//        conditon="八折";
        conditon="满200减100";

        /**
         * 正常策略模式
         */
        CashContext cashContext=null;
        switch (conditon)
        {
            case "正常收费":
                cashContext=new CashContext(new CashNormal());break;
            case  "八折":
                cashContext=new CashContext(new CashRebate("0.8"));break;
            case "满200减100":
                cashContext=new CashContext(new CashReturn("200","100"));break;
        }
        System.out.println("原价："+money+"  "+conditon+"后："+cashContext.getReslut(money));

//        /**
//         * 策略模式与简单工厂结合
//         */
//       CashContextWithFactory cashContextWithFactory=new CashContextWithFactory(conditon);
//       System.out.println("原价："+money+"  "+conditon+"后："+cashContextWithFactory.getReslut(money));
    }
}
