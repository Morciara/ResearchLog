package com.genealogy.researchlog.service;

import java.util.List;
import java.util.Optional;
import com.genealogy.researchlog.model.Person;

public interface PersonService {
    /**
     * Returns the person with the specified id.
     *
     * @param id        ID of the person to retrieve.
     * @return          The requested Person if found.
     */
    Optional<Person> findById(Integer id);

    /**
     * Returns all person in the database.
     *
     * @return          All person in the database.
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
    boolean delete(Integer id);
}
