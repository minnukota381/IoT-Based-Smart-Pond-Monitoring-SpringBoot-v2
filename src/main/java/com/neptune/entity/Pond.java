package com.neptune.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ponds")
public class Pond {
    @Id
    private String id;
    private String pondId;
    private double temperature;
    private double pH;
    private double rain;
    private double dissolvedOxygen;
    private double waterLevel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPondId() {
		return pondId;
	}
	public void setPondId(String pondId) {
		this.pondId = pondId;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getpH() {
		return pH;
	}
	public void setpH(double pH) {
		this.pH = pH;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	public double getDissolvedOxygen() {
		return dissolvedOxygen;
	}
	public void setDissolvedOxygen(double dissolvedOxygen) {
		this.dissolvedOxygen = dissolvedOxygen;
	}
	public double getWaterLevel() {
		return waterLevel;
	}
	public void setWaterLevel(double waterLevel) {
		this.waterLevel = waterLevel;
	}
    
    
}
