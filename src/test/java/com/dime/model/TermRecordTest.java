package com.dime.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TermRecordTest {
  @Test
  void testEqualsAndHashCode() {
    TermRecord term1 = new TermRecord(1L, "Name", List.of("Synonym"));
    TermRecord term2 = new TermRecord(1L, "Name", List.of("Synonym"));
    assertEquals(term1, term2);
  }

  @Test
  void testToString() {
    TermRecord term = new TermRecord(1L, "Name", List.of("Synonym"));
    assertEquals("TermRecord(id=1, word=Name, synonyms=[Synonym])", term.toString());
  }

  @Test
  void testGetters() {
    TermRecord term = new TermRecord(1L, "Name", List.of("Synonym"));
    assertEquals(1L, term.getId());
    assertEquals("Name", term.getWord());
    assertEquals(List.of("Synonym"), term.getSynonyms());
  }

  @Test
  void testSetters() {
    TermRecord term = new TermRecord(1L, "Name", List.of("Synonym"));
    term.setId(2L);
    term.setWord("New Name");
    term.setSynonyms(List.of("New Synonym"));
    assertEquals(2L, term.getId());
    assertEquals("New Name", term.getWord());
    assertEquals(List.of("New Synonym"), term.getSynonyms());
  }

  @Test
  void testNoArgsConstructor() {
    TermRecord term = new TermRecord();
    assertNull(term.getId());
    assertNull(term.getWord());
    assertNull(term.getSynonyms());
  }

}