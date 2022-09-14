package com.genealogy.researchlog.repository;

import com.genealogy.researchlog.model.Person;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

/**
 * Defines the persistence methods for a PersonRepository.
 */

public interface PersonRepository {
    @Bean
    /**
     * Returns the person with the specified id.
     *
     * @param id        ID of the person to retrieve.
     * @return          The requested Person if found.
     */
    Optional<Person> findById(String id);

    /**
     * Returns all persons in the database.
     *
     * @return          All persons in the database.
     */
    List<Person> findAll();

    /**
     * Updates the specified person, identified by its id.
     *
     * @param person   The person to update.
     * @return          True if the update succeeded, otherwise false.
     */
    boolean update(Person person);

    /**
     * Saves the specified person to the database.
     *
     * @param person   The person to save to the database.
     * @return          The saved person.
     */
    Person save(Person person);

    /**
     * Deletes the person with the specified id.
     * @param id        The id of the person to delete.
     * @return          True if the operation was successful.
     */
    boolean delete(String id);
}
