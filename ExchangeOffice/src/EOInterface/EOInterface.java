package EOInterface;

import java.util.Date;

import exchangeoffice.currency.ExchangeRates;

public interface EOInterface {
	public void addEROnDay(String currencyName, ExchangeRates er);
	public void deleteEROnDay(String currencyName, Date date);
	public ExchangeRates findAndReturn(String currencyName, Date date);
}
