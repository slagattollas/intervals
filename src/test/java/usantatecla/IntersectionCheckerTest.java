package usantatecla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionCheckerTest {

    @Test
    public void testWhenThereIsIntersectionAndCorrect(){
        //Comes the test
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(1.1).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).open(2.5).build();
        boolean validated = checker.isThereIntersection(interval, intervalCompare);
        assertTrue(validated);
    }
    @Test
    public void testWhenThereIsIntersectionWhenBothIntervals
}
