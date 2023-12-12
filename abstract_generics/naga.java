package abstract_generics;

class naga implements hewan{
	
	@Override
	public String getname() {
		return "naga";
	}
	@Override
	public int getgoldpoint() {
		return 50;
	}
	@Override
	public int gethealthdeduc(){
		return 30;
	}
	@Override
	public String getsound() {
		return "Roarr";
	}
	
}
