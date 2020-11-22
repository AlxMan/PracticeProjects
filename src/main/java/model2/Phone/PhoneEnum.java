package model2.Phone;

public enum PhoneEnum {
    //枚举类要求最上面第一行创建对象，对象的数量固定好外部不能new新的对象
    A("大卡"),B("小卡"),C("微型卡");

    private final String size;

    private PhoneEnum(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
