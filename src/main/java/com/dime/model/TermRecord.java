package com.dime.model;

import java.util.List;
import java.util.Objects;

public class TermRecord {

  private Long id;
  private String word;
  private List<String> synonyms;

  public TermRecord() {
  }

  public TermRecord(Long id, String word, List<String> synonyms) {
    this.id = id;
    this.word = word;
    this.synonyms = synonyms;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TermRecord that = (TermRecord) o;
    if (!Objects.equals(id, that.id)) return false;
    if (!Objects.equals(word, that.word)) return false;
    return Objects.equals(synonyms, that.synonyms);
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (word != null ? word.hashCode() : 0);
    result = 31 * result + (synonyms != null ? synonyms.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TermRecord(id=" + id + ", word=" + word + ", synonyms=" + synonyms + ")";
  }

}
