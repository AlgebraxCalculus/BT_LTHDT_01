public class PartTimeEmployee extends Employee implements IEmployee {
    private int workingHours;

    public PartTimeEmployee(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}
