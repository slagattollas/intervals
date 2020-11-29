package usantatecla;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionTest {
    private Intersection intersection;

    @BeforeEach
    void setup(){
        intersection = new Intersection();
    }

    @Test
    public void testWhenThereIsIntersectionAndCorrect(){
        //Comes the test
        boolean validated = intersection.isIntersection();
        assertTrue(validated);
    }
}
