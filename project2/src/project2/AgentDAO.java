package project2;

import java.util.ArrayList;
import java.util.List;

public class AgentDAO {

		  static List<Agent>agentList;
		  
		  static{
			  agentList=new ArrayList<Agent>();
			  
		  }
		  
		  public String addAgentDao(Agent agent) {
			  agentList.add(agent);
			  return"Agent Record Added...";
		  }
		  
		  public String deleteAgentDao(int agentid) {
			  Agent agentFound = searchAgentDao(agentid);
				if (agentFound!=null) {
					agentList.remove(agentFound);
					return "Agent Record Deleted...";
				}
				return "Agent Record Not Found...";
			}
			public String updateAgentDao(Agent agentNew) {
				Agent agentFound = searchAgentDao(agentNew.getAgentId());
				if (agentFound!=null) {
					for (Agent agent : agentList) {
						if (agent.getAgentId()==agentNew.getAgentId()) {
							agent.setName(agentNew.getName());
							agent.setCity(agentNew.getCity());
							agent.setPremium(agentNew.getPremium());
						}
					}
					return "Agent Record Updated Successfully...";
				}
				return "Agent Record Not Found...";
			}
			
			public Agent searchAgentDao(int agentid) {
				Agent agentFound = null;
				for (Agent agent : agentList) {
					if (agent.getAgentId()==agentid) {
						agentFound=agent;
					}
				}
				return agentFound;
			}
			
			public List<Agent> showAgentDao() {
				return agentList;
			}

	}

	

