package ru.ifmo.kot.track.mvc.entity;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
import org.hibernate.annotations.Check;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "userz", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email") })

public class userz {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private String pass;

    @Column(name = "status")
    private String status;

    @Column(name = "email")
    private String email;

    @Column(name = "date_created")
    private Date date_created;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user_id")
   private Set<uwikiz> uwiki=new HashSet<uwikiz>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy="qedited_user_id")
    private Set<qwikiz> qedited_user_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="uedited_user_id")
    private Set<uwikiz> uedited_user_id;

   /** @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="user_quest",
            joinColumns = @JoinColumn(name="userz_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="questz_id", referencedColumnName="id") )
    private Set<questz> quest;*/
   @OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.user", cascade=CascadeType.ALL)
   private Set<userquest> uq =new HashSet<userquest>(0);

    public Set<userquest> getUserQuest() {
        return uq;
    }
    public void setUserQuest(Set<userquest> uq) {
        this.uq = uq;
    }

    public userz() {
    }

    public userz(String name, String pass, String status, String email, Date date_created) {
        this.name = name;
        this.pass = pass;
        this.status = status;
        this.email = email;
        this.date_created = date_created;
    }
/**
    public userz(String name, String pass, String status, String email, Date date_created, Set<questz> quest) {
        this.name = name;
        this.pass = pass;
        this.status = status;
        this.email = email;
        this.quest = quest;
    }*/


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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate(Date date_created) {
        this.date_created = date_created;
    }

    public Set<uwikiz> getUwiki() {
        return this.uwiki;
    }

    public void setUwiki(Set<uwikiz> uwiki ) {
        this.uwiki = uwiki;
    }

    public Set<qwikiz> getQedited_user_id() {
        return this.qedited_user_id;
    }

    public void setQedited_user_id(Set<qwikiz> qedited_user_id ) {
        this.qedited_user_id = qedited_user_id;
    }

    public Set<uwikiz> getUedited_user_id() {
        return this.uedited_user_id;
    }

    public void setUedited_user_id(Set<uwikiz> uedited_user_id ) {
        this.uedited_user_id = uedited_user_id;
    }
/**
    public Set<questz> getQuest() {
        return this.quest;
    }

    public void setQuest(Set<questz> quest ) {
        this.quest = quest;
    }*/
}