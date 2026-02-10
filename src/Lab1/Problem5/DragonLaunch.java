package Lab1.Problem5;

import java.util.Vector;

public class DragonLaunch {
	private Vector<Person> persons;
	
	public DragonLaunch() {
		persons = new Vector<>();
	}
	
	public void kidnap(Person p) {
		persons.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int cnt = 0;
		for(Person p : persons) {
			if(p.getGender() == Gender.BOY) {
				cnt++;
			}
			else {
				if(cnt == 0) {
					return true;
				}
				cnt--;
			}
		}
		return false;
	}
	
	public void show() {
		for(Person p: persons) {
			if(p.getGender() == Gender.BOY) System.out.print("B");
			else System.out.print("G");
		}
		System.out.println();
	}
}
