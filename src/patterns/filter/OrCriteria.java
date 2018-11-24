package patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.firstCriteria = criteria;
        this.secondCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons = secondCriteria.meetCriteria(persons);

        List<Person> orCriteriaPersons = new ArrayList<Person>();
        for (Person person : persons) {

            if (firstCriteriaPersons.contains(person) || secondCriteriaPersons.contains(person)) {
                orCriteriaPersons.add(person);
            }
        }
        return orCriteriaPersons;
    }
}
