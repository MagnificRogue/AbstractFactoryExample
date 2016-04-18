package abstractfactoryexample;

import java.util.ArrayList;

/**
 *
 * @author Dustyn
 */
public abstract class Team implements Teammate{
    protected final ArrayList<Teammate> teamMembers = new ArrayList<>();


    /**
     * @return the teamMembers
     */
    public final ArrayList<Teammate> getTeamMembers() {
        return teamMembers;
    }
    
}
