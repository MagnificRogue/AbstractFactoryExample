package abstractfactoryexample;

/**
 *
 * @author Dustyn
 */
public abstract class AbstractTeamFactory {
    public abstract Team createTeam();
    
    protected abstract Goalie createGoalie();
    protected abstract Forward createForward();
    protected abstract Back createBack();
}
