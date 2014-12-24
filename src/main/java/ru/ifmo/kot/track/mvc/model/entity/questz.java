package ru.ifmo.kot.track.mvc.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

    @Entity
    @Table(name = "questz")
    public class questz {

        @Id
        @GeneratedValue(generator="increment")
        @GenericGenerator(name="increment", strategy = "increment")
        @Column(name = "id", length = 6, nullable = false)
        private long id;

    @Column(name = "name")
        private String name;

        @Column(name = "date_created")
        private Date date_created;

        @Column(name = "last_created")
        private Date last_created;

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "quest_id")
        private Set<qwikiz> qwiki=new HashSet<qwikiz>(0);
/**
        @ManyToMany(fetch = FetchType.LAZY, mappedBy = "quest")
        private Set<userz> user=new HashSet<userz>(0);

        public questz() {
        }*/
@OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.quest")
private Set<userquest> uq =new HashSet<userquest>(0);

         public questz(){
         };

        public questz(String name, Date date_created, Date last_created) {
            this.name = name;
            this.date_created = date_created;
            this.last_created = last_created;
        }



        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate_created() {
            return date_created;
        }

        public void setDate(Date date_created) {
            this.date_created = date_created;
        }

        public Date getLast_created() {
            return last_created;
        }

        public void setLast_created(Date last_created) {
            this.last_created = last_created;
        }

        public Set<qwikiz> getQwiki() {
            return qwiki;
        }

        public void setQwiki(Set<qwikiz> qwiki) {
            this.qwiki = qwiki;
        }


    public Set<userquest> getUserQuest() {
        return uq;
    }

    public void setUserQuest(Set<userquest> uq) {
        this.uq = uq;
    }
/**
public Set<userz> getUser() {
        return user;
    }

    public void setUser(Set<userz> user) {
        this.user = user;
    }*/
    }


