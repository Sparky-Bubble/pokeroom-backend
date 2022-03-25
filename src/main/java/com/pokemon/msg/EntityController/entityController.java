package com.pokemon.msg.EntityController;

import com.pokemon.msg.Entity.Person;
import com.pokemon.msg.EntityService.entityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class entityController{

    @Autowired
    private entityService entityService;

    //http://localhost:8081/home
    @GetMapping("/home")
    public String main(){return "Pokemon";}

    //http://localhost:8081/contacts
    @GetMapping("/contacts")
    public List<Person> getContacts(){
        return this.entityService.getContacts();
    }

    //http://localhost:8081/person/{personID}
    @GetMapping("/person/{personID}")
    public Person getByID(@PathVariable long personID){
        Optional<Person> person = Optional.ofNullable(entityService.getById(personID));
        if (person.isPresent()){
            return person.get();
        } else {
            throw new NoSuchElementException("Person not in Database.");
        }
    }

    // http://localhost:8081/addPerson
    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
        return this.entityService.addContact(person);
    }

    //http://localhost:8081/person
    @PostMapping("/sendMessage")
    public String sendMsg(@RequestBody Person person){
//        entityService.
        return null;
    }


}
