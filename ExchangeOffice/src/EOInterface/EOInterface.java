package EOInterface;

import java.util.Date;

import exchangeoffice.currency.Currency;
import exchangeoffice.currency.ExchangeRates;

public interface EOInterface {
	public void addEROnDay(Currency cur, ExchangeRates er);
	public void deleteEROnDay(Currency cur, Date date);
	public ExchangeRates findAndReturn(Currency cur, Date date);
}
