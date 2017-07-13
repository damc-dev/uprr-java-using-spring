package com.uprr.training.trn.service;

public class Train {
	private String id; //cannot be Null
	private String symbol;
	private String trainDay;
	private String arrived;
	private String arrivalLocation;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getTrainDay() {
		return trainDay;
	}
	
	public void setTrainDay(String trainDay) {
		this.trainDay = trainDay;
	}
	
	public String getArrived() {
		return arrived;
	}
	
	public void setArrived(String arrived) {
		this.arrived = arrived;
	}
	
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Train [id=");
		builder.append(id);
		builder.append(", symbol=");
		builder.append(symbol);
		builder.append(", trainDay=");
		builder.append(trainDay);
		builder.append(", arrived=");
		builder.append(arrived);
		builder.append(", arrivalLocation=");
		builder.append(arrivalLocation);
		builder.append("]");
		return builder.toString();
	}

}
