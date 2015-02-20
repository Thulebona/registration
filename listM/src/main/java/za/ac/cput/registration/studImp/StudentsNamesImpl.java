package za.ac.cput.registration.studImp;

import za.ac.cput.registration.StudentsNames;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/19.
 */
public class StudentsNamesImpl implements StudentsNames {

    @Override
    public List<String> names() {
        List list = new ArrayList();
        list.add("Thulebona Hadebe");
        list.add("Yongama ngwenduma");
        list.add("Thulebona Hadebe");

        return list;
    }
}
