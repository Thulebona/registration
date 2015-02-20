package za.ac.cput.registration.stdRecImp;

import za.ac.cput.registration.StudentRecord;

import java.util.*;

/**
 * Created by student on 2015/02/20.
 */
public class StudentRecordImp implements StudentRecord {

    @Override
    public Collection<Object> stdDetails() {
        Collection coll = new HashSet();
        coll.add("213033402");

        return coll;
    }
}
