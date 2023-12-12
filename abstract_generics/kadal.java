package abstract_generics;

class kadal implements hewan{
	
	@Override
	public String getname() {
		return "kadal";
	}
	@Override
	public int getgoldpoint() {
		return 30;
	}
	@Override
	public String getsound() {
		return "Kweek";
	}
	@Override
	public int gethealthdeduc(){
		return 10;
	}
	
}
