package methodOverriding24;

class ICICI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 7; // ICICI's rate of interest
    }
}
