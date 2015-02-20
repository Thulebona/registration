package za.ac.cput.registration;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public interface Reg
{
    List<String> names();
    Set<String> stdNumber();
    Map<String,String> levelOfStudy();
    Collection<Object> stdDetails();
}
