package payroll;

import java.util.ArrayList;
import java.util.List;

// you will need to change this class
public class PayrollService {
    private PayrollDatabase db;

    public PayrollService(PayrollDatabase db) {
        this.db = db;
    }

    // externally guaranteed to be invoked once, and only once, a day
    public List<PayCommand> calculatePayrollForToday(CalendarDay today) {
        List<PayCommand> payments = new ArrayList<PayCommand>();

        return payments;
    }
}
