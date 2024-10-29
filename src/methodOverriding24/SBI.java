package methodOverriding24;

class SBI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8; // SBI's rate of interest
    }
}
