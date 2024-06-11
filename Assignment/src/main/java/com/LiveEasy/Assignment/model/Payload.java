package com.LiveEasy.Assignment.model;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "LiveEasy")
public class Payload {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String loadingpoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private int weight;
	private String Comment;
	private String shipperid;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoadingpoint() {
		return loadingpoint;
	}
	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getShipperid() {
		return shipperid;
	}
	public void setShipperid(String string) {
		shipperid = string.toString();
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Payload(int id, String loadingpoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, int weight, String comment, String shipperid, LocalDate date) {
		super();
		this.id = id;
		this.loadingpoint = loadingpoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		Comment = comment;
		shipperid = shipperid;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Payload [id=" + id + ", loadingpoint=" + loadingpoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", Comment=" + Comment + ", Shipperid=" + shipperid + ", date=" + date + "]";
	}
	public Payload() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
