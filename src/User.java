import java.util.List;

/**
 * Created by Master Shake on 10/25/2015.
 */

public class User implements IUser {

    public String id;

    // Constructor

    public User() {

    }

    @Override
    public void follow(IUser user) {

    }

    @Override
    public void unfollow(IUser user) {

    }

    @Override
    public void addToGroup(IGroup group) {

    }

    @Override
    public void removeFromGroup(IGroup group) {

    }

    @Override
    public List<IUser> getFollowedUsers() {
        return null;
    }

    @Override
    public List<IGroup> getGroups() {
        return null;
    }

    @Override
    public List<IUser> getFollowedUsersInGroup(IGroup group) {
        return null;
    }

    @Override
    public void tweeted(String tweet) {

    }

    @Override
    public String getLastTweet() {
        return null;
    }

    @Override
    public List<String> getTweetHistory() {
        return null;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Identifiable i) {
        if (i instanceof User) {
            User j = (User)i;
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