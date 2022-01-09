package project2;

import java.util.List;
public class AgentBAL {

		   StringBuilder sb = new StringBuilder();
		 
		 public String addAgentBal(Agent Agent) throws AgentException {
			 if(validateAgent(Agent)==true) {
				 return new AgentDAO().addAgentDao(Agent);
			 } else {
				 throw new AgentException(sb.toString());
			 }
		 }
		 public String deleteAgentBal(int agentid) {
				return new AgentDAO().deleteAgentDao(agentid);
			}
			public Agent searchAgentBal(int agentid) {
				return new AgentDAO().searchAgentDao(agentid);
			}
			
			public String updateAgentBal(Agent agent) throws AgentException {
				if(validateAgent(agent)==true) {
					return new AgentDAO().updateAgentDao(agent);
				} else {
					throw new AgentException(sb.toString());
				}
			}
			public List<Agent> showAgentBal() {
				return new AgentDAO().showAgentDao();
			}


		 public boolean validateAgent(Agent agent) {
			 boolean isValid=true;
			 if(agent.getAgentId()<=0) {
				 sb.append("Agent ID Cannot be Zero or Negative\n");
				 isValid=false;
			 }
			 if (agent.getName().length() < 5 || agent.getName().length() > 12) {
					sb.append("Agent Name Contains Minimum of 5 characters and maximum of 12 characters\n");
					isValid=false;
				}
				
				if (agent.getCity().length() < 3) {
					sb.append("City Contains minimum of 3 characters\n");
					isValid=false;
				}
				
				if (agent.getPremium() < 1000 || agent.getPremium() > 50000) {
					sb.append("Agent Premium Must Between 1000 to 50000...\n");
					isValid=false;
				}
				
				if (!(agent.getGender() .equals ("MALE") || agent.getGender() .equals ("FEMALE"))) {
					sb.append("Gender must be either MALE or FEMALE...\n");
					isValid=false;
				}
			
			 return isValid;
		 }
	}


