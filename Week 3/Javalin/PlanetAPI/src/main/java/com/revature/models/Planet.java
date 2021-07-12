package com.revature.models;

import java.util.Objects;

public class Planet {
	
	private Integer id;
	private String name;
	private String description;
	private Boolean rings;
	private Double numberOfMoons;
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(int id, String name, String description, boolean rings, double numberOfMoons) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rings = rings;
		this.numberOfMoons = numberOfMoons;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	public double getNumberOfMoons() {
		return numberOfMoons;
	}
	public void setNumberOfMoons(double numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + ", rings=" + rings
				+ ", numberOfMoons=" + numberOfMoons + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, id, name, numberOfMoons, rings);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(numberOfMoons) == Double.doubleToLongBits(other.numberOfMoons)
				&& rings == other.rings;
	}
	
	

}
