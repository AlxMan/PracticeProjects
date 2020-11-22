package model2.Phone;

public abstract class PhoneAbstract {
    /**
     *  expenses    资费
     *  quantity    数量
     */
    private int expenses;
    private int quantity;

    public PhoneAbstract() {
    }

    public PhoneAbstract(int expenses,int quantity) {
        setExpenses(expenses);
        setQuantity(quantity);
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void show();
}
