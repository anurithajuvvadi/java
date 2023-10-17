package facade_pattern;

public class HometheatreFacade {
	Roomlights rl;
	Telivision t;
	Sound s;
	public HometheatreFacade(Roomlights rl,Telivision t,Sound s){
		this.rl=rl;
		this.t=t;
		this.s=s;
		
	}
	public void watchmovie() {
		rl.lightsDim();
		t.switchOnTv();
		s.SoundOn();
	}
	public void stopwatchmovie() {
		rl.lightsBright();
		t.switchOffTv();
		s.SoundOff();
	}
	

}
