package abstract_generics;

class aripama implements hewan{
	
	@Override
	public String getname() {
		return "aripama";
	}
	@Override
	public int getgoldpoint() {
		return 40;
	}
	@Override
	public String getsound() {
		return "Jedor";
	}
	@Override
	public int gethealthdeduc(){
		return 20;
	}
}
