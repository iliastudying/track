package ru.ifmo.kot.track.mvc.entity;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
import org.hibernate.annotations.Check;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "qwikiz")

public class qwikiz {

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

    @Column(name = "date_deadline")
    private Date date_deadline;

    @Column(name = "importance")
    private String importance;

    @Column(name = "complete")
    private String complete;

    @Column(name = "privacy")
    private String privacy;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "qedited_user_id", nullable = true)
    private userz qedited_user_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "quest_id", nullable = false)
    private questz quest_id;

    public qwikiz() {
    }

    public qwikiz(String version, String text, Date date_created, Date date_deadline, String importance, String complete, String privacy, userz qedited_user_id, questz quest_id) {
        this.version = version;
        this.text = text;
        this.date_created = date_created;
        this.date_deadline = date_deadline;
        this.importance = importance;
        this.complete = complete;
        this.privacy = privacy;
        this.qedited_user_id = qedited_user_id;
        this.quest_id=quest_id;
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
        return qedited_user_id;
    }

    public void setEdited_user_id(userz qedited_user_id) {
        this.qedited_user_id = qedited_user_id;
    }
    public questz getQuest_id() {
 return quest_id;
 }

 public void setQuest_id(questz quest_id) {
 this.quest_id = quest_id;
 }
}