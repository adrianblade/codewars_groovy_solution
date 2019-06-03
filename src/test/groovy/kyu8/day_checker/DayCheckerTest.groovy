import org.junit.Test

class DayCheckerTest {
    @Test
    void "Fixed Tests" () {
        Date yesterday = new Date() - 1
        Date tomorrow = new Date() + 1
        assert DayChecker.isToday(new Date()) == true
        assert DayChecker.isToday(tomorrow) == false
        assert DayChecker.isToday(yesterday) == false
    }
}