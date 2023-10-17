package design_pattern;

public class factory {

		public laptop getnewlaptop(String str) {
			if(str.equals("apple")) {
				return new applelaptop();
			}
			else if(str.equals("hp")) {
				return new delllaptop();
			}
			else {
				return new hplaptop();
			}
		}

	

}
