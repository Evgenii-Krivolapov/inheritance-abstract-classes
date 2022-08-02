package practice;

public class IndividualBusinessman extends Client {
    private final int ONE_THOUSAND = 1000;
    private double present;

    @Override
    public void put(double amountToPut) {
        if (amountToPut < ONE_THOUSAND && amountToPut > -1) {
            present += 0.01 * amountToPut;
            super.put(amountToPut - present);
        } else if (amountToPut >= ONE_THOUSAND && amountToPut > -1) {
            present += 0.005 * amountToPut;
            super.put(amountToPut - present);
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake <= clientAccount)
            super.take(amountToTake);
    }
}