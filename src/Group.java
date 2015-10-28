import java.util.List;

/**
 * Created by Master Shake on 10/25/2015.
 */

public class Group implements IGroup {

    public String id;

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
        if (i instanceof Group) {
            Group j = (Group)i;
            if (this.getID().compareTo(j.getID()) < 0) {
                return -1;
            } else if (this.getID().compareTo(j.getID()) > 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return (this.getID().compareTo(i.getID()));
        }
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