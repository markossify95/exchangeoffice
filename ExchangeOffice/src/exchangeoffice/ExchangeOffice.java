package exchangeoffice;

import java.util.LinkedList;
import exchangeoffice.currency.Currency;

public class ExchangeOffice {
	private String eoName;
	private LinkedList<Currency> list;
	
	public ExchangeOffice() {
	}

	public ExchangeOffice(String eoName, LinkedList<Currency> list) {
		if(eoName == null || eoName.isEmpty() || list == null){
			throw new RuntimeException("Error! Please make corrections to the fields you entered.");
		}
		this.eoName = eoName;
		this.list = list;
	}

	public String getName() {
		return eoName;
	}

	public void setName(String name) {
		if(name == null || name.isEmpty()){
			throw new RuntimeException("Error! Please write correct name.");
		}
		this.eoName = name;
	}

	public LinkedList<Currency> getList() {
		return list;
	}

	public void setList(LinkedList<Currency> list) {
		if(list == null){
			throw new RuntimeException("Error! The list is not valid.");
		}
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eoName == null) ? 0 : eoName.hashCode());
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
		return "ExchangeOffice [Name of the office:" + eoName;
	}

}
