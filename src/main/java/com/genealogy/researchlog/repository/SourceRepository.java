package com.genealogy.researchlog.repository;

import com.genealogy.researchlog.model.Source;

import java.util.List;
import java.util.Optional;

/**
 * Defines the persistence methods for a SourceRepository.
 */
public interface SourceRepository {
    /**
     * Returns the source with the specified id.
     *
     * @param id        ID of the source to retrieve.
     * @return          The requested Source if found.
     */
    Optional<Source> findById(Integer id);

    /**
     * Returns all sources in the database.
     *
     * @return          All sources in the database.
     */
    List<Source> findAll();

    /**
     * Updates the specified source, identified by its id.
     *
     * @param source   The source to update.
     * @return          True if the update succeeded, otherwise false.
     */
    boolean update(Source source);

    /**
     * Saves the specified source to the database.
     *
     * @param source   The source to save to the database.
     * @return          The saved source.
     */
    Product save(Source source);

    /**
     * Deletes the source with the specified id.
     * @param id        The id of the source to delete.
     * @return          True if the operation was successful.
     */
    boolean delete(Integer id);
}
