import java.util.List;

/**
 * Created by Master Shake on 10/25/2015.
 */

public class Group implements IGroup {

    // Constructor

    public Group() {

    }

    @Override
    public List<IUser> getUsers() {
        return null;
    }

    @Override
    public void addUser(IUser user) {

    }

    @Override
    public void removeUser(IUser user) {

    }

    @Override
    public int getUserCount() {
        return 0;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public void setID(String id) {

    }

    @Override
    public int compareTo(Identifiable i) {
        return 0;
    }

    @Override
    public String toString() {
        return this.getID();
    }

    @Override
    public boolean equals(Object obj) {
        return ((obj instanceof Group) && (obj == this));
    }
}