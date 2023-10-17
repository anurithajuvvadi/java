package facade_pattern;

public class User {

	public static void main(String[] args) {
Roomlights r=new Roomlights();
Telivision t=new Telivision();
Sound s=new Sound();
HometheatreFacade f= new HometheatreFacade(r,t,s);
f.watchmovie();
f.stopwatchmovie();

	}

}
