package com.sg.pubsub.payload;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	

	/**
	 * the name of the person.
	 */
	public final String name;

	/**
	 * the age of the person.
	 */
	public final int age;

	@JsonCreator
	public Person(@JsonProperty("name") String name, @JsonProperty("age") int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return this.age == person.age && Objects.equals(this.name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.age);
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + this.name + '\'' + ", age=" + this.age + '}';
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
