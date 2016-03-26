package exchangeoffice.currency;

import java.util.Date;

public class ExchangeRates {
	private Date date;
	private double sellRate;
	private double buyRate;
	private double middleRate;
	
	public ExchangeRates() {
	}
	public ExchangeRates(Date date, double sellRate, double buyRate, double middleRate) {
		this.date = date;
		this.sellRate = sellRate;
		this.buyRate = buyRate;
		this.middleRate = middleRate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getSellRate() {
		return sellRate;
	}
	public void setSellRate(double sellRate) {
		this.sellRate = sellRate;
	}
	public double getBuyRate() {
		return buyRate;
	}
	public void setBuyRate(double buyRate) {
		this.buyRate = buyRate;
	}
	public double getMiddleRate() {
		return middleRate;
	}
	public void setMiddleRate(double middleRate) {
		this.middleRate = middleRate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(buyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		temp = Double.doubleToLongBits(middleRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof ExchangeRates){
			ExchangeRates other = (ExchangeRates) obj;
			/*
			 * assuming that it is enough to check only
			 * middle rate and date of rates to prove 
			 * that they are indeed the same
			 */
			if(other.getDate().equals(this.getDate()) &&
				other.getMiddleRate() == this.getMiddleRate()){
				return true;
			}
		}
	return false;
	}
}
	
