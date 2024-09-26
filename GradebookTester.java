import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {

    // Declare two GradeBook objects
    private GradeBook g1;
    private GradeBook g2;

    // Set up method: Create two GradeBook objects and add scores
    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g1.addScore(50);
        g1.addScore(75);

        g2 = new GradeBook(5);
        g2.addScore(80);
        g2.addScore(60);
    }

    // Tear down method: Set the GradeBook objects to null
    @After
    public void tearDown() throws Exception {
        g1 = null;
        g2 = null;
    }

    // Test for addScore method
    @Test
    public void testAddScore() {
        // Check if the scores are correctly added using toString method
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertTrue(g2.toString().equals("80.0 60.0 "));
        
        // Check if scoreSize matches the number of scores added
        assertEquals(2, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    // Test for sum method
    @Test
    public void testSum() {
        // Check if sum of scores matches expected sum
        assertEquals(125, g1.sum(), .0001);
        assertEquals(140, g2.sum(), .0001);
    }

    // Test for minimum method
    @Test
    public void testMinimum() {
        // Check if minimum score matches the expected minimum score
        assertEquals(50, g1.minimum(), .001);
        assertEquals(60, g2.minimum(), .001);
    }

    // Test for finalScore method
    @Test
    public void testFinalScore() {
        // Check if finalScore (sum minus minimum score) matches expected final score
        assertEquals(75, g1.finalScore(), .0001);
        assertEquals(80, g2.finalScore(), .0001);
    }
}
