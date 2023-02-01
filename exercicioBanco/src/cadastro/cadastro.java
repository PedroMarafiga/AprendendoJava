package cadastro;

public class cadastro {

	private String name;
	private int number;
	private double money;
	
	public cadastro(String name,int number,double money) {
		this.name = name;
		this.number = number;
		addMoney(money);
	}
	
	public cadastro(String name,int number) {
		this.name = name;
		this.number = number;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getMoney() {
		return money;
	}

	public void addMoney(double money) {
		this.money += money;
	}
	
	public void whithdrawMoney(double money) {
		this.money -= money + 5;
	}

	
	public String toString() {
		return "account :" 
		+ number
		+ ",Holder : "
		+ name
		+ ",balance : R$ "
		+ String.format("%.2f",money); 
	}
}