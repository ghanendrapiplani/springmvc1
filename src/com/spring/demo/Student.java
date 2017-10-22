package com.spring.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] favHobbies;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private ArrayList<String> hobbies;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("US", "USA");

		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");

		hobbies = new ArrayList<>();
		hobbies.add("swimming");
		hobbies.add("cricket");
		hobbies.add("eating");
		hobbies.add("movies");
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getFavHobbies() {
		return favHobbies;
	}

	public void setFavHobbies(String[] favHobbies) {
		this.favHobbies = favHobbies;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

}
