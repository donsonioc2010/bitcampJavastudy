package work2;

public class unitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit u[] = {new Marine(),new Tank(),new Marine(),new Marine(),new Dropship()};
		u[0].move(100,100);
		u[1].move(200, 300);
		
		for(int i = 0; i<u.length;i++) {
			if(u[i] instanceof Marine) {
				Marine m = (Marine)u[i];
				m.StimPack();
			}
			else if(u[i] instanceof Tank) {
				((Tank)u[i]).ChangeMode();
			}
		}
	}

}
