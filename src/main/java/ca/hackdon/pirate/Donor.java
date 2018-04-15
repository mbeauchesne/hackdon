package ca.hackdon.pirate;

import java.time.LocalDateTime;

public class Donor {

	private String firstName;

	private Long amount;

	private String reason;

	private String destination;

	private LocalDateTime whenGive;

	private LocalDateTime whenReceiveService;

	public Donor(String firstName, Long amount, String reason, String destination,  LocalDateTime whenGive, LocalDateTime whenReceiveService) {
		this.firstName = firstName;
		this.amount = amount;
		this.reason = reason;
		this.destination = destination;
		this.whenGive = whenGive;
		this.whenReceiveService = whenReceiveService;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getWhenGive() {
		return whenGive;
	}

	public void setWhenGive(LocalDateTime whenGive) {
		this.whenGive = whenGive;
	}

	public LocalDateTime getWhenReceiveService() {
		return whenReceiveService;
	}

	public void setWhenReceiveService(LocalDateTime whenReceiveService) {
		this.whenReceiveService = whenReceiveService;
	}



}
