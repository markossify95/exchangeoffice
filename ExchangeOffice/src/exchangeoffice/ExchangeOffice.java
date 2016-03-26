package exchangeoffice;

import java.util.LinkedList;
import exchangeoffice.currency.Currency;

public class ExchangeOffice {
	private LinkedList<Currency> list;
	public ExchangeOffice() {
	}

	public ExchangeOffice(LinkedList<Currency> list) {
		this.list = list;
	}

	public LinkedList<Currency> getList() {
		return list;
	}

	public void setList(LinkedList<Currency> list) {
		this.list = list;
	}

}
