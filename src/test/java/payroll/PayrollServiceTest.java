package payroll;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static payroll.CalendarDay.EndOfMonthOrNot.IS_END_OF_MONTH;
import static payroll.CalendarDay.EndOfMonthOrNot.NOT_END_OF_MONTH;

public class PayrollServiceTest {

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
        CalendarDay today = CalendarDay.thursday(14, NOT_END_OF_MONTH);

        // WHEN
        List<PayCommand> payments = service.calculatePayrollForToday(today);

        // THEN
        assertEquals("There should be no payments", 0, payments.size());
    }

}
