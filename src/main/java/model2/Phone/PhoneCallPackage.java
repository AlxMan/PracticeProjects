package model2.Phone;

public class PhoneCallPackage extends PhoneAbstract implements PhoneCallInterface{
    private int message;

    PhoneConsumption code = new PhoneConsumption();
    /**
     *  expenses    资费
     *  quantity    赠送通话时间
     *  message     赠送短信
     */

    public PhoneCallPackage() {
    }

    public PhoneCallPackage(int expenses, int quantity, int message) {
        super(expenses, quantity);
        this.message = message;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }
    //重写通话接口，打印继承下来的抽象成员Expenses/quantity/以及自身的成员message
    //  通话类：打印套餐情况
    @Override
    public void show() {
        System.out.printf("通讯套餐：国内语音%d元/分钟，赠送%d分钟国内语音，赠送国内短彩信%d条，包含国内接听来电显示。",getExpenses(),getQuantity(),getMessage());
    }
    //重写接口抽象方法，计算传入进来的时间并把时间和对象传回code类的countCalltime方法中
    //  重写通话服务接口方法

    public void callPackage(int callTime,PhoneCard PhoneCard) {
        if (getQuantity() == 0){
            setQuantity(1);
        }
        code.countCallTime(callTime,getQuantity(),PhoneCard);
    }
}

