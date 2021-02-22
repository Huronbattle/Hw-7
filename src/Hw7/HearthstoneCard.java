package Hw7;

public class HearthstoneCard 
{
	private int cost;
	private int attack;
	private int health;
	private String name;
	
	public HearthstoneCard(String name, int cost, int attack, int health)
	{
		this.cost = cost;
		this.attack = attack;
		this.health = health;
		this.name = name;
	}
	

	
	void display()
	{
		
		System.out.format("Name: %s \nCost: %d \nAttack: %d Health: %d\n ", this.name, this.cost, this.attack,this.health);
	}
}