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
}
