package Lab1.Problem5;

public class Test {

	
	public static void main(String[] args) {
		DragonLaunch dl = new DragonLaunch();
		dl.kidnap(new Person("D", Gender.BOY));
		dl.kidnap(new Person("A", Gender.GIRL));
		dl.kidnap(new Person("E", Gender.BOY));
		dl.kidnap(new Person("F", Gender.GIRL));
		//dl.kidnap(new Person("S", Gender.GIRL));
		//dl.kidnap(new Person("Z", Gender.BOY));
		dl.show();
		
		if(dl.willDragonEatOrNot()) {
			System.out.print("EAT!!!!");
		}else {
			System.out.print("NOOOOOOOOO");	
		}
	}
}
