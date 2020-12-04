package model3.task5;

public enum CardNumberEnum {
    CARD_DW("大王"),
    CARD_XW("小王"),
    CARD_2("2"),
    CARD_A("A"),
    CARD_K("K"),
    CARD_Q("Q"),
    CARD_J("J"),
    CARD_10("10"),
    CARD_9("9"),
    CARD_8("8"),
    CARD_7("7"),
    CARD_6("6"),
    CARD_5("5"),
    CARD_4("4"),
    CARD_3("3");
    private final String cardNumber;

    CardNumberEnum(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return cardNumber;
    }
}
