package practice;

public class LegalPerson extends Client {
    private double present;

    @Override
    public void take(double amountToTake) {
        if (amountToTake <= clientAccount) {
            present += 0.01 * amountToTake;
            super.take(amountToTake + present);
        }
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > -1)
            super.put(amountToPut);
    }
}