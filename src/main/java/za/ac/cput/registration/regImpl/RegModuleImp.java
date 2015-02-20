package za.ac.cput.registration.regImpl;

import za.ac.cput.registration.*;
import za.ac.cput.registration.levelImpl.StudentLevelImp;
import za.ac.cput.registration.stdNumImp.StudentNumberImp;
import za.ac.cput.registration.stdRecImp.StudentRecordImp;
import za.ac.cput.registration.studImp.StudentsNamesImpl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * Created by student on 2015/02/20.
 */
public class RegModuleImp implements Reg {
    private StudentRecord stdR= new StudentRecordImp();
    private StudentsNames stdN = new StudentsNamesImpl();
    private StudentLevel stdL = new StudentLevelImp();
    private StudentNumber stdNum = new StudentNumberImp();


    @Override
    public List<String> names() {
        return stdN.names();
    }

    @Override
    public Set<String> stdNumber() {
        return stdNum.stdNumber();
    }

    @Override
    public Map<String, String> levelOfStudy() {
        return stdL.levelOfStudy();
    }

    @Override
    public Collection<Object> stdDetails() {
        return stdR.stdDetails();
    }
}
