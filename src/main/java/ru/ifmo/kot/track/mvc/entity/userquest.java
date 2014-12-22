package ru.ifmo.kot.track.mvc.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fanmilan007 on 21.12.2014.
 */
@Entity
@Table(name = "user_quest")
@AssociationOverrides({
        @AssociationOverride(name = "pk.user",
                joinColumns = @JoinColumn(name = "user_id")),
        @AssociationOverride(name = "pk.quest",
                joinColumns = @JoinColumn(name = "quest_id")) })
public class userquest {
    private userquestid pk = new userquestid();

    @EmbeddedId
    public userquestid getPk() {
        return pk;
    }

    @Transient
    public userz getUser() {
        return getPk().getUser();
    }

    public void setUser (userz  user) {
        getPk().setUser(user);
    }

    @Transient
    public questz getQuest() {
        return getPk().getQuest();
    }

    public void setQuest(questz c) {
        getPk().setQuest(c);
    }


    public void setPk(userquestid pk) {
        this.pk = pk;
    }

    @Column(name = "actual")
    private Boolean actual;

    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    @Override
    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof userquest))
            return false;
        userquest other = (userquest) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        if (actual == null) {
            if (other.actual != null)
                return false;
        } else if (!actual.equals(other.actual))
            return false;
        return true;
    }
}
