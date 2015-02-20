package za.ac.cput.registration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.registration.stdNumImp.StudentNumberImp;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class StudentNumberTest {

    StudentNumber stdNum;

    @Before
    public void setUp() throws Exception {
        stdNum = new StudentNumberImp();
        
    }

    @Test
    public void testStdNumber() throws Exception {
        Set<String> set2 = new HashSet<String>();
        set2.add("213033404");
        set2.add("213033403");
        set2.add("213033402");

       Assert.assertEquals(stdNum.stdNumber(),set2);

    }

    @After
    public void tearDown() throws Exception {
        

    }
}
