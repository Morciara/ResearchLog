package com.genealogy.researchlog.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person personUnderTest;

    @BeforeEach
    void setUp() {
        personUnderTest = new Person();
        personUnderTest.setPersonId("654321654654");
        personUnderTest.setLegacyId("5555");
        personUnderTest.setSurname("Harsen");
        personUnderTest.setGivenName("Lucinda");
        personUnderTest.setMiddleName("Alice");
        personUnderTest.setDob("25 Aug 1880");
        personUnderTest.setDod("7 Jul 1890");
        personUnderTest.setFamilySearchId("KLVN-BV8");
        personUnderTest.setFindAGraveId("654321");
    }

    @Test
    void getPersonId() {
        assertEquals("654321654654",personUnderTest.getPersonId());
    }

    @Test
    void getLegacyId() {
        assertEquals("5555",personUnderTest.getLegacyId());
    }

    @Test
    void getSurname() {
        assertEquals("Harsen",personUnderTest.getSurname());
    }

    @Test
    void getGivenName() {
        assertEquals("Lucinda",personUnderTest.getGivenName());
    }

    @Test
    void getMiddleName() {
         assertEquals("Alice",personUnderTest.getMiddleName());
    }

    @Test
    void getDob() {
        assertEquals("25 Aug 1880",personUnderTest.getDob());
    }

    @Test
    void getDod() {
        assertEquals("7 Jul 1890",personUnderTest.getDod());
    }

    @Test
    void getFamilySearchId() {
        assertEquals("KLVN-BV8",personUnderTest.getFamilySearchId());
    }

    @Test
    void getFindAGraveId() {
        assertEquals("654321",personUnderTest.getFindAGraveId());
    }

    @Test
    void testToString() {
        assertEquals("Person{id=654321654654, surname='Harsen', Death Date=7 Jul 1890}",personUnderTest.toString());
    }
}