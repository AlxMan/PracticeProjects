package model3.task5;

public enum CardColorEnum {
    COLOR1("♥"),
    COLOR2("♠"),
    COLOR3("♣"),
    COLOR4("♦");
    private final String cardColorEnum;

    CardColorEnum(String cardColorEnum) {
        this.cardColorEnum = cardColorEnum;
    }

    @Override
    public String toString() {
        return cardColorEnum;
    }
}
