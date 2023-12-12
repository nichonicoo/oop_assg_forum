package abstract_generics;

abstract class karakterw {
	private int health_point;
	private String name;
	private int gold_point;
	
	
	public karakterw(int health_point, String name, int gold_point) {

		this.health_point = health_point;
		this.name = name;
		this.gold_point = gold_point;
		
	}
	
	public void print() {
		System.out.println("name: " + name + " health: " 
		+ health_point + " gold_point: " + gold_point);
	}
	
	public void roaming(hewan hewanku) {
		
		int point = hewanku.getgoldpoint();
		int health_deduc = hewanku.gethealthdeduc();
		
		System.out.println(name + " is hunting " 
		+ hewanku.getname() + " with point " + hewanku.getgoldpoint() 
		+ " and health " + hewanku.gethealthdeduc());
		
		health_point -= health_deduc;
		
		if(health_point > 0) {
			goldaccum(point);
		}
		
	}
	
	public void goldaccum(int goldearn) {
		gold_point += goldearn;
	}
}
