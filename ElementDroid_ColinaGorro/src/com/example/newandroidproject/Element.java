package com.example.newandroidproject;

public class Element {
    private String name;
    private int image;
    private String symbol;
    private String description;
    private String atomic_number;
    private String atomic_weight;
    private String color;
    private String classification;
    private String melting_point;
    private String boiling_point;
    private String density_of_solid;
    
    
    public Element ()
        {
            // TODO Auto-generated constructor stub
        }

    public Element (String name, int image, String symbol, String description, String atomic_number, String atomic_weight, String color, String classification, String melting_point, String boiling_point, String density_of_solid)
        {
            this.name = name;
            this.image = image;
            this.symbol = symbol;
            this.description = description;
            this.atomic_number = atomic_number;
            this.atomic_weight = atomic_weight;
            this.color = color;
            this.classification = classification;
            this.melting_point = melting_point;
            this.boiling_point = boiling_point;
            this.density_of_solid = density_of_solid;
        }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAtomic_number() {
		return atomic_number;
	}

	public void setAtomic_number(String atomic_number) {
		this.atomic_number = atomic_number;
	}

	public String getAtomic_weight() {
		return atomic_weight;
	}

	public void setAtomic_weight(String atomic_weight) {
		this.atomic_weight = atomic_weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getMelting_point() {
		return melting_point;
	}

	public void setMelting_point(String melting_point) {
		this.melting_point = melting_point;
	}

	public String getBoiling_point() {
		return boiling_point;
	}

	public void setBoiling_point(String boiling_point) {
		this.boiling_point = boiling_point;
	}

	public String getDensity_of_solid() {
		return density_of_solid;
	}

	public void setDensity_of_solid(String density_of_solid) {
		this.density_of_solid = density_of_solid;
	}
    
    

}
