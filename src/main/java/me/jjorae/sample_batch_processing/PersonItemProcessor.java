package me.jjorae.sample_batch_processing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/*
 * 일괄처리의 일반적인 패러다임은 데이터를 수집하고 변환한 다음 다른 곳으로 파이프 하는 것
 * Person 객체의 이름을 대문자로 변환하는 간단한 변환기 작성
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    
    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.firstName().toUpperCase();
        final String lastName = person.lastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
    
}
