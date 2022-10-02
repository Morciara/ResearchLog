package com.genealogy.researchlog.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SourceTest {

    private Source sourceUnderTest;

    @BeforeEach
    void setUp() {
        sourceUnderTest = new Source();
        sourceUnderTest.setSourceId("654321654654");
        sourceUnderTest.setSourceName("1950 Census");
        sourceUnderTest.setAuthor("Federal Government");
        sourceUnderTest.setSourceNotes("Happy Fun Ball");
        sourceUnderTest.setArchiveId("6543216545");
        sourceUnderTest.setCallNbr("977.101acb");
    }

    @Test
    void getSourceIdTest() {
        assertEquals("654321654654",sourceUnderTest.getSourceId());
    }

    @Test
    void getSourceName() {
        assertEquals("1950 Census",sourceUnderTest.getSourceName());
    }

    @Test
    void getAuthor() {
        assertEquals("Federal Government",sourceUnderTest.getAuthor());
    }
    @Test
    void getSourceNotes() {
        assertEquals("Happy Fun Ball",sourceUnderTest.getSourceNotes());
    }
    @Test
    void getArchiveId() {
        assertEquals("6543216545",sourceUnderTest.getArchiveId());
    }
    @Test
    void getCallNbr() {
        assertEquals("977.101acb",sourceUnderTest.getCallNbr());
    }

    @Test
    void testToString() {
         assertEquals("Source{id=654321654654, name='1950 Census', author=Federal Government, notes=Happy Fun Ball}",sourceUnderTest.toString());
    }
}

