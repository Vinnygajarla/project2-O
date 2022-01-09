package project2;

import java.util.List;
import java.util.Scanner;

public class AgentMain {

		   static Scanner sc = new Scanner(System.in);
		   
		   public static void addAgent() throws AgentException {
			   Agent agent = new Agent();
			   System.out.println("Enter AgentId ");
			   agent.setAgentId(sc.nextInt());
			   System.out.println("Enter Agent Name ");
			   agent.setName(sc.next());
			   System.out.println("Enter City ");
			   agent.setCity(sc.next());
			   System.out.println("Enter Premium ");
			   agent.setPremium(sc.nextDouble());
			   System.out.println("Enter Gender ");
			   agent.setGender(sc.next());
			   AgentBAL bal=new AgentBAL();
			   System.out.println(bal.addAgentBal(agent));
			   
		   }
		   public static void deleteAgent() {
				int agentid;
				System.out.println("Enter Agent Id  ");
				agentid = sc.nextInt();
				System.out.println(new AgentDAO().deleteAgentDao(agentid));
			}

			
			public static void searchAgent() {
				int agentid;
				System.out.println("Enter Agent Id ");
				agentid = sc.nextInt();
				Agent agent = new AgentDAO().searchAgentDao(agentid);
				if (agent==null) {
					System.out.println("Agent Record Not Found...");
				} else {
					System.out.println(agent);			
				}
			}
			public static void showAgent() {
				List<Agent> agentList = new AgentBAL().showAgentBal();
				for (Agent agent : agentList) {
					System.out.println(agent);
				}
			}
			public static void updateAgent() throws AgentException {
				Agent agent = new Agent();
				System.out.println("Enter Agent Id  ");
				agent.setAgentId(sc.nextInt());
				System.out.println("Enter Agent Name   ");
				agent.setName(sc.next());
				System.out.println("Enter City   ");
				agent.setCity(sc.next());
				System.out.println("Enter Premium  ");
				agent.setPremium(sc.nextDouble());
				System.out.println("Enter Gender  ");
				agent.setGender(sc.next().trim().toUpperCase());
				AgentBAL bal = new AgentBAL();
				System.out.println(bal.updateAgentBal(agent));
			}

			public static void main(String[] args) {
				int choice;
				do {
					System.out.println(" O P T I O N S");
					System.out.println(" -------------");
					System.out.println("1. Add Agent");
					System.out.println("2. Show Agent");
					System.out.println("3. Search Agent");
					System.out.println("4. Update Agent");
					System.out.println("5. Delete Agent");
					System.out.println("6. Exit");
					System.out.println("Enter Your Choice   ");
					choice = sc.nextInt();
					switch(choice) {
					case 1 : 
						try {
							addAgent();
						} catch (AgentException e) {
							System.err.println(e.getMessage());
						}
						break;
					case 2 : 
						showAgent();
						break;
					case 3 : 
						searchAgent();
						break;
					case 4 : 
						try {
							updateAgent();
						} catch (AgentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 5 : 
						deleteAgent();
						break;
					}
				}while(choice!=6);
			}

	}

	
	
	
	