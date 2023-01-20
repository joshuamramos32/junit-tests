import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort xerxesCohort;
    Cohort xerxesCohort2;
    Cohort xerxesCohort3;

    @Before
    public void setUp(){
        this.xerxesCohort = new Cohort();
        this.xerxesCohort2 = new Cohort();
        this.xerxesCohort3 = new Cohort();

        Student josh = new Student(1,"Josh");
        Student nina = new Student( 2,"Nina");
        Student logan = new Student(3,"Logan");

        josh.addGrade(100);
        josh.addGrade(50);
        nina.addGrade(100);
        nina.addGrade(90);
        logan.addGrade(2);
        logan.addGrade(0);


        xerxesCohort.addStudent(josh);
        xerxesCohort2.addStudent(nina);
        xerxesCohort3.addStudent(josh);
        xerxesCohort3.addStudent(nina);
        xerxesCohort3.addStudent(logan);
    }
    @Test
    public void testIfStudentIsAdded(){
        assertEquals(1,xerxesCohort.getStudents().size());
        assertEquals(1,xerxesCohort2.getStudents().size());

    }

    @Test
    public void testToGetCohortAvg(){
        assertEquals(75, xerxesCohort.getCohortAverage(), 0.5);
        assertEquals(95, xerxesCohort2.getCohortAverage(), 0.5);
        assertEquals(57,xerxesCohort3.getCohortAverage(), 0.5);

    }
    @Test
    public void testToGetStudent(){
        assertEquals(1, xerxesCohort.getStudents().get(0).getId());
        assertEquals(2, xerxesCohort2.getStudents().get(0).getId());
    }

}