package za.ac.cput.registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.registration.stdRecImp.StudentRecordImp;

import java.util.Collection;
import java.util.HashSet;

/**
 * Unit test for simple App.
 */
public class StudentRecordTest {

    StudentRecord stdRec;

    @Before
    public void setUp() throws Exception {
        stdRec = new StudentRecordImp();
    }

    @Test
    public void testStdDetails() throws Exception {
        Collection coll2 = new HashSet();
        coll2.add("213033402");

        Assert.assertEquals(stdRec.stdDetails(),coll2);

    }
}