package payroll;

// you do not need to change this class
public class CalendarDay {

    private enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public enum EndOfMonthOrNot {
        NOT_END_OF_MONTH(false),
        IS_END_OF_MONTH(true);
        boolean value;

        EndOfMonthOrNot(boolean value) {
            this.value = value;
        }
    }

    private EndOfMonthOrNot isEndOfMonth;
    private int dayOfMonth;
    private Day dayOfWeek;

    boolean isEndOfMonth() {
        return isEndOfMonth.value;
    }

    boolean isNthOfMonth(int n) {
        return dayOfMonth == n;
    }

    boolean isSunday() {
        return dayOfWeek == Day.SUNDAY;
    }

    boolean isMonday() {
        return dayOfWeek == Day.MONDAY;
    }

    boolean isTuesday() {
        return dayOfWeek == Day.TUESDAY;
    }

    boolean isWednesday() {
        return dayOfWeek == Day.WEDNESDAY;
    }

    boolean isThursday() {
        return dayOfWeek == Day.THURSDAY;
    }

    boolean isFriday() {
        return dayOfWeek == Day.FRIDAY;
    }

    boolean isSaturday() {
        return dayOfWeek == Day.SATURDAY;
    }

    public static CalendarDay sunday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.SUNDAY, dayOfMonth, isEndOfMonth);
    }

    public static CalendarDay monday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.MONDAY, dayOfMonth, isEndOfMonth);
    }

    public static CalendarDay tuesday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.TUESDAY, dayOfMonth, isEndOfMonth);
    }

    public static CalendarDay wednesday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.WEDNESDAY, dayOfMonth, isEndOfMonth);
    }

    public static CalendarDay thursday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.THURSDAY, dayOfMonth, isEndOfMonth);
    }

    public static CalendarDay friday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.FRIDAY, dayOfMonth, isEndOfMonth);
    }

    public static CalendarDay saturday(int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        return new CalendarDay(Day.SATURDAY, dayOfMonth, isEndOfMonth);
    }

    private CalendarDay(Day dayOfWeek, int dayOfMonth, EndOfMonthOrNot isEndOfMonth) {
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = dayOfMonth;
        this.isEndOfMonth = isEndOfMonth;
    }
}
