package test;

import java.util.Date;

import EOInterface.EOInterface;
import exchangeoffice.currency.Currency;
import exchangeoffice.currency.ExchangeRates;

public class Test implements EOInterface {

	@Override
	public void addEROnDay(Currency cur, ExchangeRates er) {
		if(cur == null || er == null){
			throw new RuntimeException("Error! Not a valid entry.");
		}
		cur.getListOfRates().add(er);
	}

	@Override
	public void deleteEROnDay(Currency cur, Date date) {
		if(cur == null || date == null || date.after(new Date())){
			throw new RuntimeException("Error! Not a valid entry.");
		}

		for (int i = 0; i < cur.getListOfRates().size(); i++) {
			if(cur.getListOfRates().get(i).getDate().equals(date)){
				cur.getListOfRates().remove(i);
				return;
			}
		}
	}

	@Override
	public ExchangeRates findAndReturn(Currency cur, Date date) {
		if(cur == null || date == null || date.after(new Date())){
			throw new RuntimeException("Error! Not a valid entry.");
		}
		for (int i = 0; i < cur.getListOfRates().size(); i++) {
			if(cur.getListOfRates().get(i).getDate().equals(date)){
				return cur.getListOfRates().get(i);
			}
		}
		return null;
	}

}
