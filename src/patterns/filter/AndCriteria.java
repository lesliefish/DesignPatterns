package patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.firstCriteria = criteria;
        this.secondCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaPersons = secondCriteria.meetCriteria(persons);

        List<Person> andCriteriaPersons = new ArrayList<>();

        for (Person person : persons) {
            if (firstCriteriaPersons.contains(person) && secondCriteriaPersons.contains(person)) {
                andCriteriaPersons.add(person);
            }
        }

        return andCriteriaPersons;
    }
}
