package usantatecla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionCheckerTest {

    @Test
    public void testWhenThereIsIntersectionAndCorrect(){
        //Comes the test
        boolean validated = intersection.isIntersection();
        assertTrue(validated);
    }
}
