package abstractfactoryexample.HockeyTeam;

import abstractfactoryexample.AbstractTeamFactory;
import abstractfactoryexample.Back;
import abstractfactoryexample.Forward;
import abstractfactoryexample.Goalie;
import abstractfactoryexample.Team;

/**
 *
 * @author Dustyn
 */
public class HockeyTeamFactory extends AbstractTeamFactory{

    @Override
    public Team createTeam() {
      HockeyTeam t = new HockeyTeam();
      
      t.getTeamMembers().add(createGoalie());
      t.getTeamMembers().add(createForward());
      t.getTeamMembers().add(createBack());
      t.getTeamMembers().add(createBack());
      
      
      
      return t;
    }

    @Override
    protected Goalie createGoalie() {
        return new HockeyGoalie();
    }

    @Override
    protected Forward createForward() {
        return new HockeyForward();
    }

    @Override
    protected Back createBack() {
        return new HockeyBack();
    }
    
}
