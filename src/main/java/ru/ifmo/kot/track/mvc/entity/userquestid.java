package ru.ifmo.kot.track.mvc.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by fanmilan007 on 21.12.2014.
 */
@Embeddable
public class userquestid implements java.io.Serializable {
    private userz user;
    private questz quest;

    @ManyToOne
    public userz getUser() {
        return user;
    }


    public void setUser(userz user) {
        this.user = user;
    }


    @ManyToOne
    public questz getQuest() {
        return quest;
    }


    public void setQuest(questz quest) {
        this.quest = quest;
    }


    @Override
    public int hashCode() {
        int result;
        result = (user != null ? user.hashCode() : 0);
        result = 17 * result + (quest != null ? quest.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof userquestid))
            return false;
        userquestid other = (userquestid) obj;
        if (quest == null) {
            if (other.quest != null)
                return false;
        } else if (!quest.equals(other.quest))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }
}
