package usantatecla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionCheckerTest {

    @Test
    public void testWhenThereIsIntersectionOnClosedCompareIntervalAndCorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).closed(2.5).build();
        boolean validated = checker.isThereIntersection(interval, intervalCompare);
        assertTrue(validated);

    }
    @Test
    public void testWhenThereIsIntersectionOnOpenCompareIntervalAndCorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).open(2.6).build();
        boolean validated = checker.isThereIntersection(interval, intervalCompare);
        assertTrue(validated);
    }

    @Test
    public void testWhenThereIsIntersectionOnClosedCompareIntervalAndIncorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).closed(2.4).build();
        boolean validated = checker.isThereIntersection(interval, intervalCompare);
        assertFalse(validated);

    }
    @Test
    public void testWhenThereIsIntersectionOnOpenCompareIntervalAndIncorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).open(2.5).build();
        boolean validated = checker.isThereIntersection(interval, intervalCompare);
        assertFalse(validated);
    }
    @Test
    public void testGetIntersectionsValuesWhenOpenCompareIntervalCorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).open(2.6).build();
        Interval validated = checker.getIntersection(interval, intervalCompare);
        Interval correctInterval = new IntervalBuilder().open(2.5).open(2.6).build();
        assertEquals(validated, correctInterval);
    }
    @Test
    public void testGetIntersectionsValuesWhenClosedCompareIntervalCorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).closed(2.5).build();
        Interval validated = checker.getIntersection(interval, intervalCompare);
        Interval correctInterval = new IntervalBuilder().open(2.5).closed(2.5).build();
        assertEquals(validated, correctInterval);
    }
    @Test
    public void testGetIntersectionsValuesWhenOpenCompareIntervalInCorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).open(2.6).build();
        Interval validated = checker.getIntersection(interval, intervalCompare);
        Interval correctInterval = new IntervalBuilder().open(2.5).open(2.5).build();
        assertNotEquals(validated, correctInterval);
    }
    @Test
    public void testGetIntersectionsValuesWhenClosedCompareIntervalInCorrect(){
        IntersectionChecker checker = new IntersectionChecker();
        Interval interval = new IntervalBuilder().open(2.5).open(3.3).build();
        Interval intervalCompare = new IntervalBuilder().open(1.2).closed(2.5).build();
        Interval validated = checker.getIntersection(interval, intervalCompare);
        Interval correctInterval = new IntervalBuilder().open(2.5).closed(2.6).build();
        assertNotEquals(validated, correctInterval);
    }


}
