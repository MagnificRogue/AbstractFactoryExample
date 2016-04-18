package abstractfactoryexample.SoccerTeam;

import abstractfactoryexample.AbstractTeamFactory;
import abstractfactoryexample.Back;
import abstractfactoryexample.Forward;
import abstractfactoryexample.Goalie;
import abstractfactoryexample.Team;

/**
 *
 * @author Dustyn
 */
public class SoccerTeamFactory extends AbstractTeamFactory{

    @Override
    public Team createTeam() {
        SoccerTeam t = new SoccerTeam();
        
        t.getTeamMembers().add(createForward());
        t.getTeamMembers().add(createForward());
        t.getTeamMembers().add(createForward());
        t.getTeamMembers().add(createForward());

        t.getTeamMembers().add(createBack());
        t.getTeamMembers().add(createBack());
        t.getTeamMembers().add(createBack());
        t.getTeamMembers().add(createBack());
          
        t.getTeamMembers().add(createGoalie());
        
        return t;
    }

    @Override
    protected Goalie createGoalie() {
        return new SoccerGoalie();
    }

    @Override
    protected Forward createForward() {
        return new SoccerForward();
    }

    @Override
    protected Back createBack() {
        return new SoccerBack();
    }
    
}
