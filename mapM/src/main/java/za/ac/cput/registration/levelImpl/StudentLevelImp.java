package za.ac.cput.registration.levelImpl;

import za.ac.cput.registration.StudentLevel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/19.
 */
public class StudentLevelImp implements StudentLevel {
    @Override
    public Map<String, String> levelOfStudy() {

        Map lvl = new HashMap();

        lvl.put("213033401","1st year");
        lvl.put("213033402","2nd year");
        lvl.put("213033403","2nd year");

        return lvl;
    }
}
