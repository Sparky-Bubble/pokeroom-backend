package com.pokemon.msg.DAO;

import com.pokemon.msg.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface entityDAO extends JpaRepository<Person, Long> {
}
