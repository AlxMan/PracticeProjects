package model2.Phone;

public class Test {
    public static void main(String[] args) {
        System.out.println("============================注册手机==================================");
        //  订购通话套餐
        PhoneAbstract phoneCallPackage = new PhoneCallPackage(1,0,0);
        //  订购上网套餐
        PhoneAbstract phoneInternetPackage = new PhoneInternetPackage(1,0);
        //  创建消费统计
        PhoneConsumption phoneConsumption = new PhoneConsumption(phoneCallPackage.getQuantity(),phoneInternetPackage.getQuantity(),20);
        //  注册一张手机卡，枚举手机卡类型：大卡
        PhoneCard phoneCard = new PhoneCard(PhoneEnum.B.getSize(),"10000","用户名","密码",1000,
                phoneCallPackage.getQuantity(),phoneInternetPackage.getQuantity());
        //  打印手机卡信息
        phoneCard.show(phoneCallPackage.getQuantity(),phoneInternetPackage.getQuantity());

        // 消费
        phoneCard.addCall(120,phoneCard);
        phoneCard.addInternet(20,phoneCard);

        //显示账户余额
        phoneCard.showAccountBalance();

        //再次消费测试
        phoneCard.addCall(120,phoneCard);
        phoneCard.addInternet(20,phoneCard);
        phoneCard.addCall(120,phoneCard);
        phoneCard.addInternet(20,phoneCard);
        phoneCard.showAccountBalance();
    }
    }
