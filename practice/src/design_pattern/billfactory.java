package design_pattern;

public class billfactory {
	public electricity getelecbill(String type,int unit) {
		if(type.equals("industrial")) {
			return new industrial();
		}
		else if(type.equals("domestic")) {
			return new domestic();
		}
		else {
			return new institutional();
		}

}
}
