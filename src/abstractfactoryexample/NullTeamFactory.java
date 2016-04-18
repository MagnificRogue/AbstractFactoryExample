package abstractfactoryexample;

/**
 *
 * @author Dustyn
 */
public class NullTeamFactory extends AbstractTeamFactory{

    @Override
    public Team createTeam() {
        throw new UnsupportedOperationException("Attempted call on NullTeamFactory method");
    }

    @Override
    protected Goalie createGoalie() {
        throw new UnsupportedOperationException("Attempted call on NullTeamFactory method"); 
    }

    @Override
    protected Forward createForward() {
        throw new UnsupportedOperationException("Attempted call on NullTeamFactory method"); 
    }

    @Override
    protected Back createBack() {
        throw new UnsupportedOperationException("Attempted call on NullTeamFactory method"); 
    }
    
}
