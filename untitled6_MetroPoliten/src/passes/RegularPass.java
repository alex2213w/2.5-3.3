package passes;

public class RegularPass extends MetroPass{
    private int amountOfMoney;

    public RegularPass(int uid, int amountOfMoney) {
        super(uid);
        this.amountOfMoney = amountOfMoney;
    }

    public RegularPass(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
