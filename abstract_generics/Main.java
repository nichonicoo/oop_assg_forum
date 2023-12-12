package abstract_generics;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		karakterw fuxuan = new karakterw(300, "Fuxuan", 0) {
	};
	
	hewan[] monster_index = {new kadal(), new aripama(), new naga()};
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Berapa lama bertarung (1-10) : ");
	int days = scanner.nextInt();
	
	
	for(int i =0; i<days; i++) {
		Random randoms = new Random();
		int index_rand = randoms.nextInt(monster_index.length);
		hewan index_no = monster_index[index_rand];
		
		fuxuan.roaming(index_no);
	}
	fuxuan.print();
	}
	
}
