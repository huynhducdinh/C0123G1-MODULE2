package module_2_apj.molel.person;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<PersonCha>{
    @Override
    public int compare(PersonCha o1, PersonCha o2) {
        return o1.getCodee()-o2.getCodee();

    }
}
