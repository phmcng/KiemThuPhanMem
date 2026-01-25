import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int result = analyzer.countExcellentStudents(
                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
        );

        assertEquals(2, result);
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int result = analyzer.countExcellentStudents(Collections.emptyList());

        assertEquals(0, result);
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int result = analyzer.countExcellentStudents(
                Arrays.asList(0.0, 10.0)
        );

        assertEquals(1, result);
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        double avg = analyzer.calculateValidAverage(
                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
        );

        assertEquals(8.17, avg, 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        double avg = analyzer.calculateValidAverage(Collections.emptyList());

        assertEquals(0, avg);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        double avg = analyzer.calculateValidAverage(
                Arrays.asList(-5.0, 15.0)
        );

        assertEquals(0, avg);
    }
}
