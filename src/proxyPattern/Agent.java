package proxyPattern;

public class Agent {
    private String agentUsername;
    private boolean agentIsLoggedIn;
    public Agent(String agentUsername) {
        this.agentUsername = agentUsername;
        this.agentIsLoggedIn = false;  // default is not logged in. (false)

    }
    //setters
    // method to log in the agent,
    // (change param 'agentIsLoggedIn' from "false(-)" to "true(+)").
    public void logIn() {
        if(agentIsLoggedIn == false) {

            this.agentIsLoggedIn = true;
        System.out.println(agentUsername + " logged in.");
            }
        else {
            System.out.println(agentUsername + " is already logged in.");
        }
    }
    // method to log out the agent
    // (change param 'agentIsLoggedIn' from "true(+)" to "false(-)" ).

    public void logOut() {
        if(agentIsLoggedIn == true) {
            this.agentIsLoggedIn = false;
            System.out.println(agentUsername + " logged out.");
        }
        else {
            System.out.println(agentUsername + " is not logged in, so log out is not possible.");
        }
    }

    public void setAgentUsername(String agentUsername) {
        this.agentUsername = agentUsername;
    }

    public void setAgentIsLoggedIn(boolean agentIsLoggedIn) {
        this.agentIsLoggedIn = agentIsLoggedIn;
    }

    //getters:
    public boolean isLoggedIn() {
        return agentIsLoggedIn;
    }

    public String getUsername() {
        return agentUsername;
    }
}
