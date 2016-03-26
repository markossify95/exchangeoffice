package exchangeoffice;

import java.util.LinkedList;
import exchangeoffice.currency.Currency;

public class ExchangeOffice {
	private String Name;
	private LinkedList<Currency> list;
	public ExchangeOffice() {
	}

	public ExchangeOffice(LinkedList<Currency> list) {
		this.list = list;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LinkedList<Currency> getList() {
		return list;
	}

	public void setList(LinkedList<Currency> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj instanceof ExchangeOffice){
			ExchangeOffice other = (ExchangeOffice) obj;
			if(other.getName().equals(this.getName())){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ExchangeOffice [Name of the office:" + Name;
	}

}
