package abstractfactoryexample;

import abstractfactoryexample.HockeyTeam.HockeyTeamFactory;
import abstractfactoryexample.SoccerTeam.SoccerTeamFactory;

/**
 *
 * @author Dustyn
 */
public class AbstractFactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AbstractTeamFactory f = new NullTeamFactory();
        
        String type = args[0];
        
        switch(type)
        {
            case "Hockey":
                f = new HockeyTeamFactory();
                break;
            
            case "Soccer":
                f = new SoccerTeamFactory();
                break;
            
        }

        Team t = f.createTeam();
        
        for(Teammate m : t.getTeamMembers()) {
            System.out.println(m.getRole());
        }
        
        

    }
    
}
