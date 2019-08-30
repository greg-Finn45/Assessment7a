package co.grandcircus.assessment7a.entity;

import java.util.List;

public class AnimalsResponse {

	private List<Results> results;

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public AnimalsResponse(List<Results> results) {
		super();
		this.results = results;
	}

	public AnimalsResponse() {
		super();
	}

	@Override
	public String toString() {
		return "AnimalsResponse [results=" + results + "]";
	}


}
