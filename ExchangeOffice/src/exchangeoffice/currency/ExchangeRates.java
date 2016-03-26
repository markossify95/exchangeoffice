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
}
