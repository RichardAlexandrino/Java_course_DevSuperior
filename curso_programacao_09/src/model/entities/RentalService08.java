package model.entities;

import java.time.Duration;

public class RentalService08 {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService08 taxService;

	public RentalService08(Double pricePerHour, Double pricePerDay, TaxService08 taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental08 carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		double basicPayment;
		
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);	
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice08(basicPayment, tax));
	}
}
