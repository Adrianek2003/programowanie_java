public class accounts {
    private String mOwner;
    private int mBalance;
    private String mAccountNumber;

    public accounts(String aOwner, int aBalance, String aAccountNumber) {
        this.mOwner = aOwner;
        this.mBalance = aBalance;
        this.mAccountNumber = aAccountNumber;
    }

    public String getOwner() {
        return mOwner;
    }

    public int getBalance() {
        return mBalance;
    }

    public void setOwner(String aOwner) {
        this.mOwner = aOwner;
    }

    public String getAccountNumber() {
        return mAccountNumber;
    }

    public void setBalance(int aBalance) {
        this.mBalance = aBalance;
    }

    public void setAccountNumber(String aAccountNumber) {
        this.mAccountNumber = aAccountNumber;
    }

    public void transferMoney(int aAmount) throws notenoughmoney {
        if (aAmount > mBalance) {
            throw new notenoughmoney("You don't have enough money to make this operation.");
        }
        mBalance -= aAmount;
    }
}
