package com.genealogy.researchlog.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArchiveInformationTest {

    private ArchiveInformation archiveInformationUnderTest;

    @BeforeEach
    void setUp() {
        archiveInformationUnderTest = new ArchiveInformation();
        archiveInformationUnderTest.setId("654321654654");
        archiveInformationUnderTest.setName("Family Search");
        archiveInformationUnderTest.setWebSite("www.familysearch.org");
        archiveInformationUnderTest.setStreetAddress("123 Main Street");
        archiveInformationUnderTest.setCity("Salt Lake City");
        archiveInformationUnderTest.setState("Utah");
        archiveInformationUnderTest.setEmailAddress("familysearch@gmail.com");
    }

    @Test
    void getSetId() {
        assertEquals("654321654654",archiveInformationUnderTest.getId());
    }
    @Test
    void getName() {
        assertEquals("Family Search",archiveInformationUnderTest.getName());
    }
    @Test
    void getWebsite() {
        assertEquals("www.familysearch.org",archiveInformationUnderTest.getWebSite());
    }

    @Test
    void getStreetAddress() {
        assertEquals("123 Main Street",archiveInformationUnderTest.getStreetAddress());
    }

    @Test
    void getCity() {
        assertEquals("Salt Lake City",archiveInformationUnderTest.getCity());
    }

    @Test
    void getState() {
        assertEquals("Utah",archiveInformationUnderTest.getState());
    }

    @Test
    void getEmailAddress() {
        assertEquals("familysearch@gmail.com",archiveInformationUnderTest.getEmailAddress());
    }

    @Test
    void testToString() {

        assertEquals("Archive{id=654321654654, name='Family Search', website=www.familysearch.org}",archiveInformationUnderTest.toString());
    }
}
