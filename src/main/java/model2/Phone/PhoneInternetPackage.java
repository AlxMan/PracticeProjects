package model2.Phone;

public class PhoneInternetPackage extends PhoneAbstract implements PhoneInternetInterface{
    /**
     *  expenses    资费
     *  quantity    数量
     */

    PhoneConsumption code = new PhoneConsumption();
    PhoneInternetPackage() {
    }

    public PhoneInternetPackage(int expenses, int quantity) {
        super(expenses, quantity);
    }
    //重写抽象方法，并且打印继承下来的抽象方法中的成员以及自身的成员
    //  重写抽象套餐类，打印套餐信息（充值）
    @Override
    public void show() {
        System.out.printf("上网套餐：国内流量日租%d元/GB，赠送国内流量%dGB",getExpenses(),getQuantity());
    }
    public void internetPackage(int internetTraffic, PhoneCard PhoneCard) {
        if(getExpenses() == 0){
            setExpenses(1);
        }
        code.countInternetTraffic(internetTraffic,getExpenses(),PhoneCard);
    }
    //重写接口中的抽象方法，把流量、资费、对象传回code。countInternetTraffic方法中
    //  重写上网流量接口（使用）

}
