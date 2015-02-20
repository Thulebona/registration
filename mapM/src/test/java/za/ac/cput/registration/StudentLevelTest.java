package za.ac.cput.registration;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.registration.levelImpl.StudentLevelImp;

/**
 * Unit test for simple App.
 */
public class StudentLevelTest {

    StudentLevel studLvl;

    @Before
    public void setUp() throws Exception {
        studLvl = new StudentLevelImp();
    }

    @Test
    public void testLevelOfStudy() throws Exception {

        Assert.assertEquals(studLvl.levelOfStudy().get("213033402"),studLvl.levelOfStudy().get("213033403"));
    }

    @After
    public void tearDown() throws Exception {


    }
}

