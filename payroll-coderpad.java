import java.io.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

// no changes needed
enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

enum EndOfMonthOrNot {
    NOT_END_OF_MONTH(false),
    IS_END_OF_MONTH(true);
    boolean value;

    EndOfMonthOrNot(boolean value) {
        this.value = value;
    }
}

// no changes needed
class CalendarDay {
    private EndOfMonthOrNot endOfMonthOrNot;
    private int dayOfMonth;
    private WeekDay dayOfWeek;

    boolean isEndOfMonth() { return endOfMonthOrNot.value; }

    boolean isNthOfMonth(int n) { return dayOfMonth == n; }

    boolean isSunday() { return dayOfWeek == WeekDay.SUNDAY; }

    boolean isMonday() { return dayOfWeek == WeekDay.MONDAY; }

    boolean isTuesday() { return  dayOfWeek == WeekDay.TUESDAY; }

    boolean isWednesday() { return  dayOfWeek == WeekDay.WEDNESDAY; }

    boolean isThursday() { return  dayOfWeek == WeekDay.THURSDAY;  }

    boolean isFriday() { return  dayOfWeek == WeekDay.FRIDAY; }

    boolean isSaturday() { return  dayOfWeek == WeekDay.SATURDAY; }

    CalendarDay(WeekDay dayOfWeek, int dayOfMonth, EndOfMonthOrNot endOfMonthOrNot) {
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = dayOfMonth;
        this.endOfMonthOrNot = endOfMonthOrNot;
    }
}

// no changes needed
class PayCommand {
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

// not allowed to change
interface PayrollDatabase {
    int totalSalesGenerated(CalendarDay from, CalendarDay to, Employee who);

    int totalHoursWorked(CalendarDay from, CalendarDay to, Employee who);

    CalendarDay whenLastPaid(Employee e);

    List<Employee> allEmployees();
}

// design changes needed here
interface Employee {
}

// implementation changes needed here
class PayrollService {
    @SuppressWarnings("unused")
    private PayrollDatabase db;

    public PayrollService(PayrollDatabase db) {
        this.db = db;
    }

    public List<PayCommand> calculatePayrollForToday(CalendarDay today) {
        List<PayCommand> payments = new ArrayList<PayCommand>();

        return payments;
    }
}

public class Solution {
    // tests, add more
    @Test
    public void whenThereAreNoEmployeesNobodyShouldBePaid() {
        // GIVEN
        PayrollDatabase db = new FakePayrollDatabase() {
            @Override
            public List<Employee> allEmployees() {
                return Collections.emptyList();
            }
        };
        PayrollService service = new PayrollService(db);
        CalendarDay today = new CalendarDay(
                WeekDay.THURSDAY, 14, EndOfMonthOrNot.NOT_END_OF_MONTH);

        // WHEN
        List<PayCommand> payments = service.calculatePayrollForToday(today);

        // THEN
        assertNotNull(payments);
        assertEquals("There should be no payments", 0, payments.size());
    }

    // no changes needed, test entry point
    public static void main(String[] args) {
        JUnitCore.main("Solution");
    }
}

// fake for testing, no changes needed, each test will create a descendant of this class
class FakePayrollDatabase implements PayrollDatabase {

    @SuppressWarnings("serial")
    static class NotImplementedException extends RuntimeException {}

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
