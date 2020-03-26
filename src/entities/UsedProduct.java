package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManuFactureDate() {
		return manufactureDate;
	}
	
	public void setManuFactureDate(Date manuFactureDate) {
		this.manufactureDate = manuFactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + " (used)" + " $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(getManuFactureDate()) + ")"; 
	}

}