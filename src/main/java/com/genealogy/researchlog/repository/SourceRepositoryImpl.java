package com.genealogy.researchlog.repository;

import com.genealogy.researchlog.Source;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class SourceRepositoryImpl implements SourceRepository {

    private static final Logger logger = LogManager.getLogger(SourceRepositoryImpl.class);

    private final JdbcTemplate jdbcTemplate;
    private final SimpleJdbcInsert simpleJdbcInsert;

    public SourceRepositoryImpl(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;

        // Build a SimpleJdbcInsert object from the specified data source
        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("source")
                .usingGeneratedKeyColumns("sourceId");
    }

    @Override
    public Optional<Source> findById(Integer id) {
        try {
            Source source = jdbcTemplate.queryForObject("SELECT * FROM source WHERE sourceId = ?",
                    new Object[]{id},
                    (rs, rowNum) -> {
                        Source s = new Source();
                        s.setSourceId(rs.getInt("sourceId"));
                        s.setRepositoryId(rs.getInt("repositoryId"));
                        s.setSourceName(rs.getString("sourceName"));
                        s.setAuthor(rs.getString("author"));
                        s.setCallNbr(rs.getString("callNbr"));
                        s.setWebSite(rs.getString("webSite"));
                        s.setSourceNotes(rs.getString("sourceNotes"));
                      
                        return s;
                    });
            return Optional.of(source);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Source> findAll() {
        return jdbcTemplate.query("SELECT * FROM source",
                (rs, rowNumber) -> {
                    Source source = new Source();
                    source.setSourceId(rs.getInt("sourceId"));
                    source.setRepositoryId(rs.getInt("repositoryId"));
                    source.setSourceName(rs.getString("sourceName"));
                    source.setAuthor(rs.getString("author"));
                    source.setCallNbr(rs.getString("callNbr"));
                    source.setWebSite(rs.getString("webSite"));
                    source.setSourceNotes(rs.getString("sourceNotes"));
                    return source;
                });
    }

    @Override
    public boolean update(Source source) {
        return jdbcTemplate.update("UPDATE source SET repositoryId = ?, sourceName = ?, author = ?, callNbr = ?, webSite = ?, sourceNotes = ? WHERE sourceId = ?",
               source.getRepositoryId(),
               source.getSourceName(),
               source.getAuthor(),
               source.getCallNbr(),
               source.getWebSite(),
               source.getSourceNotes(),
               source.getSourceId()) == 1;
    }

    @Override
    public Source save(Source source) {
        // Build the source parameters we want to save
        Map<String, Object> parameters = new HashMap<>(1);
        
        parameters.put("repositoryId", source.getRepositoryId());
        parameters.put("sourceName", source.getSourceName());
        parameters.put("author", source.getAuthor());
        parameters.put("callNbr",source.getCallNbr());
        parameters.put("webSite",source.getWebSite());
        parameters.put("sourceNotes",source.getSourceNotes());

        // Execute the query and get the generated key
        Number newId = simpleJdbcInsert.executeAndReturnKey(parameters);

        logger.info("Inserting source into database, generated key is: {}", newId);

        // Update the product's ID with the new key
        source.setId((Integer)newId);

        // Return the complete source
        return source;
    }

    @Override
    public boolean delete(Integer id) {
        return jdbcTemplate.update("DELETE FROM source WHERE sourceId = ?", id) == 1;
    }
}
