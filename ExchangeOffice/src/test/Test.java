package test;

import java.util.Date;

import EOInterface.EOInterface;
import exchangeoffice.currency.ExchangeRates;

public class Test implements EOInterface {

	@Override
	public void addEROnDay(String currencyName, ExchangeRates er) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEROnDay(String currencyName, Date date) {
		// TODO Auto-generated method stub

	}

	@Override
	public ExchangeRates findAndReturn(String currencyName, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
