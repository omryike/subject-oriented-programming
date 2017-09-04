package human;

public class mind extends soul implements body{
	private boolean soul_connected;

	public static void main(String []args) {
		mind myMind = new mind(false);
		myMind.Think();
		myMind._procreate();
		myMind._eat();
	}

	public mind(boolean soul_connected) {
		this.soul_connected = soul_connected;
	}
	public void FallInLove() {
		if(this.soul_connected) {
			this.Love();
		} else {
			this.FearLife();
		}
	}
	public void Think() {
		if(this.soul_connected) {
			this.Contemplate();
		} else {
			this.FearLife();
		}
	}
	public void FearLife() {
		System.out.println("I am in suffering!");
	}
	public void _procreate() {
		if(this.soul_connected) {
			this.EnjoyLife();
		} else {
			this.FearLife();
		}
	}
	public void _eat() {
		if(this.soul_connected) {
			this.EnjoyLife();
		} else {
			this.FearLife();
		}
	}
	public void _fearDeath() {
		this.FearLife();
	}
}
