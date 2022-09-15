package com.genealogy.researchlog.repository;

import com.genealogy.researchlog.model.Archive;

import java.util.List;
import java.util.Optional;

/**
 * Defines the persistence methods for a ArchiveRepository.
 */

public interface ArchiveRepository {

    /**
     * Returns the archive with the specified id.
     *
     * @param id        ID of the archive to retrieve.
     * @return          The requested Archive if found.
     */
    Optional<Archive> findById(String id);

    /**
     * Returns all archives in the database.
     *
     * @return          All archives in the database.
     */
    List<Archive> findAll();

    /**
     * Updates the specified archive, identified by its id.
     *
     * @param archive   The archive to update.
     * @return          True if the update succeeded, otherwise false.
     */
    boolean update(Archive archive);

    /**
     * Saves the specified archive to the database.
     *
     * @param archive   The archive to save to the database.
     * @return          The saved archive.
     */
    Archive save(Archive archive);

    /**
     * Deletes the archive with the specified id.
     * @param id        The id of the archive to delete.
     * @return          True if the operation was successful.
     */
    boolean delete(String id);
}
