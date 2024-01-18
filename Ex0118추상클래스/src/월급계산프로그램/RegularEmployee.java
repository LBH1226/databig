package 월급계산프로그램;

public class RegularEmployee extends Employee {

	// 필드
	
	private int bonus;
	
	
	//메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
	
	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	
	
}
