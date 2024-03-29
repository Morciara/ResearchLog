package com.genealogy.researchlog.service;

import com.genealogy.researchlog.model.Source;

import java.util.List;
import java.util.Optional;
import com.genealogy.researchlog.model.Source;

public interface SourceService {
    /**
     * Returns the source with the specified id.
     *
     * @param id        ID of the source to retrieve.
     * @return          The requested Source if found.
     */
    Optional<Source> findById(Integer id);

    /**
     * Returns all source in the database.
     *
     * @return          All source in the database.
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
    Source save(Source source);

    /**
     * Deletes the source with the specified id.
     * @param id        The id of the source to delete.
     * @return          True if the operation was successful.
     */
    boolean delete(Integer id);
}
