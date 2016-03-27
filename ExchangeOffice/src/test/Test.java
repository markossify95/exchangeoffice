package test;

import java.util.Date;

import EOInterface.EOInterface;
import exchangeoffice.currency.Currency;
import exchangeoffice.currency.ExchangeRates;

public class Test implements EOInterface {

	@Override
	public void addEROnDay(Currency cur, ExchangeRates er) {
		if(cur == null || er == null){
			return;
		}
		cur.getListOfRates().add(er);
	}

	@Override
	public void deleteEROnDay(Currency cur, Date date) {
		// TODO Auto-generated method stub

	}

	@Override
	public ExchangeRates findAndReturn(Currency cur, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
