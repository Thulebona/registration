package za.ac.cput.registration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.registration.studImp.StudentsNamesImpl;

/**
 * Created by student on 2015/02/19.
 */
public class StudentsNamesTest   {

    StudentsNames stud;

    @Before
    public void setUp() throws Exception {
        stud = new StudentsNamesImpl();

    }

    @Test
    public void testNames() throws Exception {

        Assert.assertEquals(stud.names().get(0),stud.names().get(2));
    }

    @After
    public void tearDown() throws Exception {


    }
}
