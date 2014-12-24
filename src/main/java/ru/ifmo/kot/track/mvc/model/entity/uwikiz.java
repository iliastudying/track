package ru.ifmo.kot.track.mvc.model.entity;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "uwikiz")
public class uwikiz {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "version")
    private String version;

    @Column(name = "text")
    private String text;

    @Column(name = "date_created")
    private Date date_created;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "uedited_user_id")
    private userz uedited_user_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id")
    private userz user_id;

    public uwikiz() {
    }

    public uwikiz(String version, String text, Date date_created, userz uedited_user_id, userz user_id) {
        this.version = version;
        this.text = text;
        this.date_created = date_created;
        this.uedited_user_id = uedited_user_id;
       this.user_id = user_id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Date getDate_created() {
        return date_created;
    }

    public void setDate(Date date_created) {
        this.date_created = date_created;
    }

  public userz getEdited_user_id() {
        return uedited_user_id;
    }

    public void setEdited_user_id(userz uedited_user_id) {
        this.uedited_user_id = uedited_user_id;
    }

public userz getUser_id() {
     return user_id;
     }

     public void setUser_id(userz user_id) {
     this.user_id = user_id;
     }
}