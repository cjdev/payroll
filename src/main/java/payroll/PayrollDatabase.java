package payroll;

import java.util.List;

// you must not change this class
// the database is being worked on by a different department
// however, you may change the Employee class
public interface PayrollDatabase {
    int totalSalesGenerated(CalendarDay from, CalendarDay to, Employee who);

    int totalHoursWorked(CalendarDay from, CalendarDay to, Employee who);

    CalendarDay whenLastPaid(Employee e);

    List<Employee> allEmployees();
}
