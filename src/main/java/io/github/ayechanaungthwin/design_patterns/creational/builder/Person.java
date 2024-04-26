package io.github.ayechanaungthwin.design_patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Person {

	@Getter
	private String name;
	
	@Getter
	private int age;
	
	@Getter
	private boolean hasNRC;
	
	@Getter
	private boolean hasPassport;
	
	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.hasNRC = builder.hasNRC;
		this.hasPassport = builder.hasPassport;
	}
	
	public static class PersonBuilder {
		private String name;
		private int age;
		private boolean hasNRC;
		private boolean hasPassport;
		
		public PersonBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public PersonBuilder setHasNRC(boolean hasNRC) {
			this.hasNRC = hasNRC;
			return this;
		}
		
		public PersonBuilder setHasPassport(boolean hasPassport) {
			this.hasPassport = hasPassport;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
}
