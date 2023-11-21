import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {
    @Test
    public void testGetId() {
        Student student = new Student(1, "Abe Garcia");
        assertEquals(1, student.getId());
    }
    @Test
    public void testGetName() {
        Student student = new Student(1, "Abe Garcia");
        assertEquals("Abe Garcia", student.getName());
    }
    @Test
    public void testAddGrade() {
        Student student = new Student(1, "Abe Garcia");
        student.addGrade(70);
        assertTrue(student.getGrades().contains(70));
    }
    @Test
    public void testGetGrades() {
        Student student = new Student(1, "Abe Garcia");
        student.addGrade(70);
        student.addGrade(80);
        ArrayList<Integer> expectedGrades = new ArrayList<>();
        expectedGrades.add(70);
        expectedGrades.add(80);
        assertEquals(expectedGrades, student.getGrades());
    }
    @Test
    public void testGetGradeAverage() {
        Student student = new Student(1, "Abe Garcia");
        student.addGrade(70);
        student.addGrade(80);
        double average = (70 + 80) / 2.0;
        assertEquals(average, student.getGradeAverage(), 0.01);
    }

}

