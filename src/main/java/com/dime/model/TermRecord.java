package com.dime.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TermRecord {

  /**
   * The term id.
   */
  private Long id;

  /**
   * The term word.
   */
  private String word;

  /**
   * The synonyms of the term.
   */
  private List<String> synonyms;
}
