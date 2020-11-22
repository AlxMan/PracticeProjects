package model2.Phone;

public class PhoneConsumption {
    private int callTime;
    private int internetTraffic;
    private int expenses;
    /**
     *  callTime            统计通话时长
     *  internetTraffic     统计上网流量
     *  expenses            统计消费金额
     */

    PhoneConsumption() {
    }

    public PhoneConsumption(int callTime, int internetTraffic, int expenses) {
        setCallTime(callTime);
        setInternetTraffic(internetTraffic);
        setExpenses(expenses);
    }

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }
//通话时长方法与统计上网流量方法只能依顺序进行，确保账户扣款的准确性
//1、接收到普通通话类传过来的参数，根据手机卡情况统计消费时长并且打印账户余额，如果账户中通话时长为0就是初始通话调用if中的语句，如果账户中通话时长大于0就是历史通话调用else语句
    public void countCallTime(int quantity,int expenses,PhoneCard PhoneCard){
        //  统计通话时长
        if(PhoneCard.getCallTime() == 0){
            PhoneCard.setCallTime(quantity);    //  初次通话时间
        }else {
            setCallTime(PhoneCard.getCallTime()+quantity);
            PhoneCard.setCallTime(getCallTime());   //  登记历史通话时间
        }
        PhoneCard.setAccountBalance(PhoneCard.getAccountBalance()-(quantity*expenses));
        System.out.println("============================历史通话时间==================================");
        System.out.printf("历史通话时间：%d分钟，账户余额%d元\n",PhoneCard.getCallTime(),PhoneCard.getAccountBalance());
    }
//2、接收普通上网类传过来的参数，根据手机卡情况统计上网情况，原理与上述方法一致
    public void countInternetTraffic(int quantity,int PhoneCard,PhoneCard phoneCard){
        //  统计上网流量
        if(phoneCard.getInternetTraffic() == 0){
            phoneCard.setInternetTraffic(quantity);    //初次登记历史通话时间
        }else {
            setInternetTraffic(phoneCard.getInternetTraffic()+quantity);
            phoneCard.setInternetTraffic(getInternetTraffic());
        }
        phoneCard.setAccountBalance(phoneCard.getAccountBalance()-(quantity*PhoneCard));
        System.out.println("==========================历史流量使用情况================================");
        System.out.printf("历史流量使用情况：%dGB,账户余额%d元\n",phoneCard.getInternetTraffic(),phoneCard.getAccountBalance());
    }
}
