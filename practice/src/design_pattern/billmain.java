package design_pattern;

public class billmain {

	public static void main(String[] args) {
		billfactory lp=new billfactory();
		electricity el=lp.getelecbill("institutional",50);
		el.bill(50);
	}

}
