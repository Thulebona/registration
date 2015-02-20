package za.ac.cput.registration.stdNumImp;

import za.ac.cput.registration.StudentNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/19.
 */
public class StudentNumberImp implements StudentNumber {
    @Override
    public Set<String> stdNumber() {

        Set set1 = new HashSet();

        set1.add("213033404");
        set1.add("213033403");
        set1.add("213033402");
        return set1;
    }
}
