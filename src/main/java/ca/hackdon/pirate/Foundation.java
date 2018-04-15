package ca.hackdon.pirate;

import java.util.LinkedList;
import java.util.List;

public class Foundation {

	String address;

	String name;

	List<Donor> donorList = new LinkedList<Donor>();

	Long totalAmount;

	Long averageGive;

	List<CareService> careServiceList = new LinkedList<CareService>();

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Donor> getDonorList() {
		return donorList;
	}

	public void setDonorList(List<Donor> donorList) {
		this.donorList = donorList;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getAverageGive() {
		return averageGive;
	}

	public void setAverageGive(Long averageGive) {
		this.averageGive = averageGive;
	}

	public List<CareService> getCareServiceList() {
		return careServiceList;
	}

	public void setCareServiceList(List<CareService> careServiceList) {
		this.careServiceList = careServiceList;
	}



}
