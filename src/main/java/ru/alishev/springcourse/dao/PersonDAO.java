package ru.alishev.springcourse.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.alishev.springcourse.models.Person;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Transactional
    public List<Person> index() {
       Session session = sessionFactory.getCurrentSession();
       List<Person> people = session.createQuery("SELECT p FROM Person p", Person.class).getResultList();
       return people;
    }

        public Person show(int index) {
        return null;
    }
    public Optional<Person> show(String email) {
        return null;
    }

    public void addPerson(Person person) {
        int count = 4;

    }

    public void update(int id, Person person) {

    }

    public void delete(int id) {

    }





    ////JdbcTemplate

//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public PersonDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Person> index() {
//        return jdbcTemplate.query("SELECT * from person", new BeanPropertyRowMapper<>(Person.class));
//    }
//
//    public Person show(int index) {
//        return jdbcTemplate.query("SELECT * FROM person WHERE id = ?", new Object[]{index}, new BeanPropertyRowMapper<>(Person.class))
//                .stream().findAny().orElse(null);
//    }
//    public Optional<Person> show(String email) {
//        return jdbcTemplate.query("SELECT * FROM person WHERE email = ?", new Object[]{email},
//                new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
//    }
//
//    public void addPerson(Person person) {
//        int count = 4;
//        jdbcTemplate.update("INSERT into person(name, age, email, address) values (?, ?, ?, ?)",
//                person.getName(), person.getAge(), person.getEmail(), person.getAddress());
//    }
//
//    public void update(int id, Person person) {
//        jdbcTemplate.update("UPDATE person set name = ?, age = ?, email = ?, address = ? where id = ?",
//                person.getName(), person.getAge(), person.getEmail(), person.getAddress(), id);
//    }
//
//    public void delete(int id) {
//        jdbcTemplate.update("DELETE from person where id = ?", id);
//    }





}
