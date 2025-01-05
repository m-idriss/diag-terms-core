package com.dime.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TermRecord {

  private Long id;
  private String word;
  private List<String> synonyms;
}
