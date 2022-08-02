package practice;

public abstract class Client {
    protected double clientAccount;

    public double getAmount() {
        return clientAccount;
    }

    public void put(double amountToPut) {
        clientAccount += amountToPut;
    }

    public void take(double amountToTake) {
        clientAccount -= amountToTake;
    }
}