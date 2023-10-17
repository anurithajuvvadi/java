package design_pattern;

public class factorymain {

	public static void main(String[] args) {
factory lp=new factory();
laptop alp=lp.getnewlaptop("apple");
alp.spec();
	}

}
