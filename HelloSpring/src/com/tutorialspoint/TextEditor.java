package com.tutorialspoint;

public class TextEditor {
	private ByNameSpellChecker spellChecker;

	// a setter method to inject the dependency.
	public void setSpellChecker(ByNameSpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public ByNameSpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
