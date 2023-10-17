package springdemo.springcoreorderexample;

public class Order {
	private int order_id;
	private String product_name;
	private int order_no;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int order_id, String product_name, int order_no) {
		super();
		this.order_id = order_id;
		this.product_name = product_name;
		this.order_no = order_no;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", product_name=" + product_name + ", order_no=" + order_no + "]";
	}
	

}
