package com.mybudget.business;

import java.io.Serializable;

public class Budget implements Serializable{
	
	//we could also separate these into smaller classes based on the category (ex. transportation, housing)

	int rent;
	int utilities;
	int phone;
	int wifi;
	int car;
	int insurance;
	int publicTransportation;
	int parking;
	int savings;
	int investments;
	
}
