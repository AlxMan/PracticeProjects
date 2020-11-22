package model2.Phone;
/**
 * . 按照要求设计并实现以下实体类和接口。
 *
 *     3.1 第一步：设计和实现以下类
 *
 *     （1）手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 行为：显示（卡号 + 用户名 + 当前余额）
 *
 *     （2）通话套餐类 特征：通话时长、短信条数、每月资费 行为: 显示所有套餐信息
 *      (3）上网套餐类 特征：上网流量、每月资费 行为：显示所有套餐信息
 *
 *     （4）用户消费信息类 特征：统计通话时长、统计上网流量、每月消费金额
 *
 *     3.2 第二步：设计和实现以下枚举类 手机卡的类型总共有 3 种：大卡、小卡、微型卡
 *
 *     3.3 第三步：实体类的优化 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。
 *
 *     3.4 第四步：创建并实现以下接口
 *
 *     （1）通话服务接口 抽象方法: 参数1: 通话分钟, 参数2: 手机卡类对象 让通话套餐类实现通话服务接口。
 *
 *     （2）上网服务接口 抽象方法: 参数1: 上网流量, 参数2: 手机卡类对象 让上网套餐类实现上网服务接口。
 *     3.5 第五步：进行代码测试
 *     编写测试类使用多态格式分别调用上述方法，方法体中打印一句话进行功能模拟即可。
 **/
public class PhoneCard {
    private String cardType;
    private String phoneNumber;
    private String name;
    private String password;
    private int accountBalance;
    private int callTime;
    private int internetTraffic;
    /**
     * cardType         卡类型
     * phoneNumber      卡号
     * name             用户名
     * password         密码
     * accountBalance   账户余额
     * callTime         通话时间
     * internetTraffic  总上网流量
     */
    PhoneCallPackage callPackage = new PhoneCallPackage();
    PhoneInternetPackage internetPackage = new PhoneInternetPackage();
    PhoneCard(){};
    //初始化手机卡
    public PhoneCard(String cardType, String phoneNumber, String name, String password, int accountBalance, int callTime, int internetTraffic) {
        setCardType(cardType);
        setPhoneNumber(phoneNumber);
        setName(name);
        setPassword(password);
        setAccountBalance(accountBalance);
        setCallTime(callTime);
        setInternetTraffic(internetTraffic);
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
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

    //  订购上网套餐

    //1、show方法使用传多个参数方式接收对象
    //  打印账户信息
    public void show(int... args){
        System.out.println("============================手机卡信息==================================");
        for(int i = 0;i<args.length;i++){
            if(i == 0){
                setCallTime(args[i]);
            }else{
                setInternetTraffic(args[i]);
            }
        }
        showAccountBalance();
    }
    //2、showAccountBalance方法打印账户情况
    public void showAccountBalance(){
        //  显示账户余额
        System.out.println("==============================账户余额================================");
        System.out.println("手机卡类型:"+getCardType()+"\n卡号:"+getPhoneNumber()+"\n用户名："+getName()+"\n密码："+getPassword()+
                "\n账户余额:"+getAccountBalance()+"\n历史通话时长："+getCallTime()+"分钟\n历史流量使用情况:"+getInternetTraffic()+"GB");
    }
    //3、创建通话消费方法addCall，传入到普通通话类中
      //通话消费
    public void addCall(int a,PhoneCard phoneCard){
        callPackage.callPackage(a,phoneCard);
    }
    //4、创建流量消费方法addinternet，传入到普通上网类中
    //  流量消费
    public void addInternet(int a,PhoneCard phoneCard){
        internetPackage.internetPackage(a,phoneCard);
    }

}
