package za.ac.cput.registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.registration.regImpl.RegModuleImp;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by student on 2015/02/20.
 */
public class RegMmoduleTest {

    Reg rg;
    @Before
    public void setUp() throws Exception {

        rg = new RegModuleImp();

    }
    @Test
    public void testLevelOfStudy() throws Exception {

        Assert.assertEquals(rg.levelOfStudy().get("213033402"),"2nd year");
    }

    @Test
    public void testNames() throws Exception {

        Assert.assertEquals(rg.names().get(0),rg.names().get(2));
    }

    @Test
    public void testStdNumber() throws Exception {

        Assert.assertEquals(rg.stdNumber().iterator().next(),"213033404");

    }

    @Test
    public void testStdRecord() throws Exception {

        Collection col = new HashSet();
        col.add("213033402");
        Assert.assertEquals(rg.stdDetails(),col);

    }
}
