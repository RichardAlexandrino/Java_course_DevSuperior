package model.entities;

import java.time.LocalDateTime;

public class CarRental08 {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle08 vehicle;
	private Invoice08 invoice;
	
	public CarRental08() {
	}

	public CarRental08(LocalDateTime start, LocalDateTime finish, Vehicle08 vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle08 getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle08 vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice08 getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice08 invoice) {
		this.invoice = invoice;
	}

	
}
