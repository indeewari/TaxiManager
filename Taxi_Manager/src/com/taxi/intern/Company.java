/**
 * 
 */
package com.taxi.intern;

/**
 * @author Iresha
 *
 */
public class Company {
	
	private int cabServiceID;
	private int companyID;
	private String serviceName;
	private String contactNumber;
	private int ratings;
	private float costPerkm;
	private float approxTripCost;
	private float tripDistance;
	private float lancoordinate;
	private float longcoordinate;
	

	public int getCompanyID() {
		return companyID;
	}



	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}



	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public float getCostPerkm() {
		return costPerkm;
	}

	public void setCostPerkm(float costPerkm) {
		this.costPerkm = costPerkm;
	}

	public float getApproxTripCost() {
		return approxTripCost;
	}

	public void setApproxTripCost(float approxTripCost) {
		this.approxTripCost = approxTripCost;
	}

	public float getTripDistance() {
		return tripDistance;
	}

	public void setTripDistance(float tripDistance) {
		this.tripDistance = tripDistance;
	}

	public float getLancoordinate() {
		return lancoordinate;
	}

	public void setLancoordinate(float lancoordinate) {
		this.lancoordinate = lancoordinate;
	}

	public float getLongcoordinate() {
		return longcoordinate;
	}

	public void setLongcoordinate(float longcoordinate) {
		this.longcoordinate = longcoordinate;
	}

	public int getCabServiceID() {
		return cabServiceID;
	}
	
	

}
