package abstractfactoryexample.SoccerTeam;

import abstractfactoryexample.Goalie;

/**
 *
 * @author Dustyn
 */
public class SoccerGoalie extends Goalie{

    @Override
    public String getRole() {
        return "Soccer Goalie";
    }
    
}
