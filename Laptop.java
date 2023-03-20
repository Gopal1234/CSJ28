package cyber.demos;

import java.util.Objects;

public class Laptop {
	private String brand;
	private int price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && price == other.price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}
	
   /* public boolean equals(Object obj)
    {
    	Laptop laptop=(Laptop)obj;
    	return(this.brand==laptop.brand && this.price==laptop.price);
    }
	
    public String toString()
    {
    	return brand + ":" +price;
    }*/
	
	
    }
