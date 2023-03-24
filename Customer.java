package cyber.pack1;

public class Customer {
	private int customerId;
	private String customerNmae;
	private long customerPhone;
	private String customerEmail;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerNmae() {
		return customerNmae;
	}
	public void setCustomerNmae(String customerNmae) {
		this.customerNmae = customerNmae;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerNmae=" + customerNmae + ", customerPhone="
				+ customerPhone + ", customerEmail=" + customerEmail + "]";
	}
	
	
	
	
	
}
