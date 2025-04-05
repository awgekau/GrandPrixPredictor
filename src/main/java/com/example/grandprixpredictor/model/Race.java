package com.example.grandprixpredictor.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic race details
    private String circuit;
    private LocalDate date;

    // Weather and environmental factors
    private String weatherCondition;    // e.g., "Sunny", "Cloudy", "Rainy"
    private Double temperature;         // in degrees Celsius
    private Double humidity;            // percentage, e.g., 75.0 for 75%
    private Double precipitation;       // in millimeters
    private Double windSpeed;           // in km/h or m/s

    // Track and race-specific metrics
    private String trackCondition;      // e.g., "Dry", "Wet", "Intermediate"
    private Double trackLength;         // in kilometers
    private Double lapRecordTime;       // best lap time in seconds
    private Integer numberOfLaps;       // total laps in the race

    // Car and driver performance factors
    private Double carPerformanceRating;     // rating from 0 to 100 (aggregated car metrics)
    private Double wetDriverPerformanceRating; // rating from 0 to 100 for wet conditions

    // Additional factors
    private String pitStopStrategy;    // e.g., "Aggressive", "Conservative", "Balanced"
    private Double rainProbability;    // as a percentage (0.0 to 100.0)

    // Constructors
    public Race() {}

    public Race(String circuit, LocalDate date, String weatherCondition, Double temperature,
                Double humidity, Double precipitation, Double windSpeed, String trackCondition,
                Double trackLength, Double lapRecordTime, Integer numberOfLaps,
                Double carPerformanceRating, Double wetDriverPerformanceRating,
                String pitStopStrategy, Double rainProbability) {
        this.circuit = circuit;
        this.date = date;
        this.weatherCondition = weatherCondition;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitation = precipitation;
        this.windSpeed = windSpeed;
        this.trackCondition = trackCondition;
        this.trackLength = trackLength;
        this.lapRecordTime = lapRecordTime;
        this.numberOfLaps = numberOfLaps;
        this.carPerformanceRating = carPerformanceRating;
        this.wetDriverPerformanceRating = wetDriverPerformanceRating;
        this.pitStopStrategy = pitStopStrategy;
        this.rainProbability = rainProbability;
    }

    // Getters and Setters
    // (Generate these using your IDE or manually add them)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getTrackCondition() {
        return trackCondition;
    }

    public void setTrackCondition(String trackCondition) {
        this.trackCondition = trackCondition;
    }

    public Double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Double trackLength) {
        this.trackLength = trackLength;
    }

    public Double getLapRecordTime() {
        return lapRecordTime;
    }

    public void setLapRecordTime(Double lapRecordTime) {
        this.lapRecordTime = lapRecordTime;
    }

    public Integer getNumberOfLaps() {
        return numberOfLaps;
    }

    public void setNumberOfLaps(Integer numberOfLaps) {
        this.numberOfLaps = numberOfLaps;
    }

    public Double getCarPerformanceRating() {
        return carPerformanceRating;
    }

    public void setCarPerformanceRating(Double carPerformanceRating) {
        this.carPerformanceRating = carPerformanceRating;
    }

    public Double getWetDriverPerformanceRating() {
        return wetDriverPerformanceRating;
    }

    public void setWetDriverPerformanceRating(Double wetDriverPerformanceRating) {
        this.wetDriverPerformanceRating = wetDriverPerformanceRating;
    }

    public String getPitStopStrategy() {
        return pitStopStrategy;
    }

    public void setPitStopStrategy(String pitStopStrategy) {
        this.pitStopStrategy = pitStopStrategy;
    }

    public Double getRainProbability() {
        return rainProbability;
    }

    public void setRainProbability(Double rainProbability) {
        this.rainProbability = rainProbability;
    }
}
