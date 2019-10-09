package payroll;

import java.util.List;

class FakePayrollDatabase implements PayrollDatabase {

    @SuppressWarnings("serial")
    static class NotImplementedException extends RuntimeException {
    }

    @Override
    public List<Employee> allEmployees() {
        throw new NotImplementedException();
    }

    @Override
    public int totalHoursWorked(CalendarDay from, CalendarDay to, Employee who) {
        throw new NotImplementedException();
    }

    @Override
    public int totalSalesGenerated(CalendarDay from, CalendarDay to, Employee who) {
        throw new NotImplementedException();
    }

    @Override
    public CalendarDay whenLastPaid(Employee e) {
        throw new NotImplementedException();
    }
}