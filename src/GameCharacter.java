
public class GameCharacter {
	private String name = " ";
	private int health;
	private int attack;
	
	public GameCharacter(String aName, int aHealth, int anAttack) {
		this.name = new String(aName);
		this.health = aHealth;
		this.attack = anAttack;
	}
	
	public GameCharacter(GameCharacter aCharacter) {
		this.name = aCharacter.getName();
		this.health = aCharacter.health;
		this.attack = aCharacter.attack;
	}

	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	public int getAttack() {
		return attack;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void loseHealth(int damage) {
		health -= damage;
	}
	public String toString(){
		return name + " , Health: " + health + " , Attack: " + attack;
	}

}


