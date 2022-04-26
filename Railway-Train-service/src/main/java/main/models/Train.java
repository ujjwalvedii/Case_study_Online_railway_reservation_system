package main.models;

import java.time.LocalTime;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Trains")
public class Train {

	@Id
	private String id;
	private String trainNo;
	private String trainName;
	private String depatureStation;
	private String arrivalStation;
	private LocalTime depatureTime;
	private LocalTime arrivalTime;
	private String[] run_days;
	private Map<String,Seat> classes;
	private boolean isFare;
	private boolean active;
	private String quota;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getDepatureStation() {
		return depatureStation;
	}
	public void setDepatureStation(String depatureStation) {
		this.depatureStation = depatureStation;
	}
	public String getArrivalStation() {
		return arrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	public LocalTime getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(LocalTime depatureTime) {
		this.depatureTime = depatureTime;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String[] getRun_days() {
		return run_days;
	}
	public void setRun_days(String[] run_days) {
		this.run_days = run_days;
	}
	public Map<String, Seat> getClasses() {
		return classes;
	}
	public void setClasses(Map<String, Seat> classes) {
		this.classes = classes;
	}
	public boolean isFare() {
		return isFare;
	}
	public void setFare(boolean isFare) {
		this.isFare = isFare;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getQuota() {
		return quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}
	public Train(String id, String trainNo, String trainName, String depatureStation, String arrivalStation,
			LocalTime depatureTime, LocalTime arrivalTime, String[] run_days, Map<String, Seat> classes, boolean isFare,
			boolean active, String quota) {
		super();
		this.id = id;
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.depatureStation = depatureStation;
		this.arrivalStation = arrivalStation;
		this.depatureTime = depatureTime;
		this.arrivalTime = arrivalTime;
		this.run_days = run_days;
		this.classes = classes;
		this.isFare = isFare;
		this.active = active;
		this.quota = quota;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
