package project2;

public class Agent {
	private int agentId;
	private String name;
	private String city;
	private double premium;
	private String gender;
	
	
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Agent() {
	
		// TODO Auto-generated constructor stub
	}
	public Agent(int agentId, String name, String city, double premium, String gender) {
		super();
		this.agentId = agentId;
		this.name = name;
		this.city = city;
		this.premium = premium;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", city=" + city + ", premium=" + premium + ", gender="
				+ gender + "]";
	}	

}
