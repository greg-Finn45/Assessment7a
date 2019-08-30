package co.grandcircus.assessment7a.entity;

import java.util.ArrayList;

public class Species {

	private Integer id;
	private String name;
	private Double weight;
	private ArrayList<String> species;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public ArrayList<String> getSpecies() {
		return species;
	}
	public void setSpecies(ArrayList<String> species) {
		this.species = species;
	}
	public Species(Integer id, String name, Double weight, ArrayList<String> species) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.species = species;
	}
	public Species() {
		super();
	}
	@Override
	public String toString() {
		return "Species [id=" + id + ", name=" + name + ", weight=" + weight + ", species=" + species + "]";
	}
	
	
}
