package ca.hackdon.pirate;

public class CareService {

	String name;

	Long peopleReceiveNumber;

	Long payByFoundation;

	Long payByGouv;

	Long averageCostForOneService;

	public CareService(String name, Long peopleReceiveNumber, Long payByFoundation, Long payByGouv, Long averageCostForOneService) {
		this.name = name;
		this.peopleReceiveNumber = peopleReceiveNumber;
		this.payByFoundation = payByFoundation;
		this.payByGouv = payByGouv;
		this.averageCostForOneService = averageCostForOneService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPeopleReceiveNumber() {
		return peopleReceiveNumber;
	}

	public void setPeopleReceiveNumber(Long peopleReceiveNumber) {
		this.peopleReceiveNumber = peopleReceiveNumber;
	}

	public Long getPayByFoundation() {
		return payByFoundation;
	}

	public void setPayByFoundation(Long payByFoundation) {
		this.payByFoundation = payByFoundation;
	}

	public Long getPayByGouv() {
		return payByGouv;
	}

	public void setPayByGouv(Long payByGouv) {
		this.payByGouv = payByGouv;
	}

	public Long getAverageCostForOneService() {
		return averageCostForOneService;
	}

	public void setAverageCostForOneService(Long averageCostForOneService) {
		this.averageCostForOneService = averageCostForOneService;
	}

}
