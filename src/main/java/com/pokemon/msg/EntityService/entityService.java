package com.pokemon.msg.EntityService;

import com.pokemon.msg.Entity.Person;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface entityService {
    Person getById(long personID);
    List<Person> getContacts();
    Person addContact(Person person);
    Person addMessage(Long personID, String message);
//    List<String> viewMessages(Long personID);
}
