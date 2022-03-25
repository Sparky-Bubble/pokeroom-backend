package com.pokemon.msg.EntityService;

import com.pokemon.msg.DAO.entityDAO;
import com.pokemon.msg.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class entityImp implements entityService {

    @Autowired
    public entityDAO entityDAO;

    @Override
    public Person getById(long personID) {
        Optional<Person> person = entityDAO.findById(personID);
        Person p = null;

        try {
            if (person.isPresent()) {
                p = person.get();
            }
        } catch (NoSuchElementException e){
            System.out.println(p.getName() + " not present in Database.");
        }
        return this.entityDAO.getById(personID);
        }

    @Override
    public List<Person> getContacts() {
        return entityDAO.findAll();
    }

    @Override
    public Person addContact(Person person) {
        return this.entityDAO.save(person);
    }


    @Override
    public Person addMessage(Long personID, String message) {
        Optional<Person> person = entityDAO.findById(personID);
        Person p = null;

        try {
            if (person.isPresent()) {
                p = person.get();
                p.setText(message);

            }
        } catch (NoSuchElementException e){
            System.out.println(p.getName() + " not present in Database.");
        }
        return this.entityDAO.getById(personID);
    }

//    @Override
//    public List<String> viewMessages(Long personID) {
//        Optional<Person> person = entityDAO.findById(personID);
//        Person p = null;
//        try{
//            if (person.isPresent()){
//                p = person.get();
//            }
//        } catch (NoSuchElementException e){
//            System.out.println(person.get().getName() + " not in Database for ID of " + personID);
//        }
//        return p.;
//    }


}
