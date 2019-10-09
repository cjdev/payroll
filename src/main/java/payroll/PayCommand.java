package payroll;

// you will not need to change this class
public class PayCommand {
    private final Employee employee;
    private final int amount;

    public PayCommand(Employee employee, int amount) {
        this.employee = employee;
        this.amount = amount;
    }

    public int amount() {
        return amount;
    }

    public Employee employee() {
        return employee;
    }
}
