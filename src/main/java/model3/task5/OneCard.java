package model3.task5;

public class OneCard {
    private CardColorEnum color; //牌花色
    private CardNumberEnum number; //牌面值
    private Integer value;  //权重

    public OneCard(CardColorEnum color, CardNumberEnum number, Integer value) {
        this.color = color;
        this.number = number;
        this.value = value;
    }

    @Override
    public String toString() {
        return (color==null ? "" : color + "-") + number;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

