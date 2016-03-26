package exchangeoffice.currency;

import java.util.LinkedList;

public class Currency {
	private String name;
	private String shortName;
	private LinkedList<ExchangeRates> listOfRates;
	
	public Currency() {
	}
	public Currency(String name, String shortName, LinkedList<ExchangeRates> listOfRates) {
		this.name = name;
		this.shortName = shortName;
		this.listOfRates = listOfRates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public LinkedList<ExchangeRates> getListOfRates() {
		return listOfRates;
	}
	public void setListOfRates(LinkedList<ExchangeRates> listOfRates) {
		this.listOfRates = listOfRates;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfRates == null) ? 0 : listOfRates.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((shortName == null) ? 0 : shortName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj instanceof Currency){
			Currency other = (Currency) obj;
			if(other.getName().equals(this.getName())){
				return true;
			}
		}
		return false;
	}
	
	
}
