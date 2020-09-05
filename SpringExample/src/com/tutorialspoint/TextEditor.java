package com.tutorialspoint;

public class TextEditor {
   private ByNameSpellChecker spellChecker;
   private String name;
   
   public void setSpellChecker( ByNameSpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public ByNameSpellChecker getSpellChecker() {
      return spellChecker;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}