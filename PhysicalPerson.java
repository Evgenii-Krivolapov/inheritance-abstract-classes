package practice;

public class PhysicalPerson extends Client {
    @Override
    public void put(double amountToPut) {
        if (amountToPut > -1) {
            super.put(amountToPut);
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake <= clientAccount) {
            super.take(amountToTake);
        }
    }
}