package ru.ifmo.kot.track.mvc;

import ru.ifmo.kot.track.mvc.entity.*;
import ru.ifmo.kot.track.mvc.service.Impl.QwikizServiceImpl;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ifmo.kot.track.mvc.config.DataConfig;
import ru.ifmo.kot.track.mvc.service.Impl.QuestzServiceImpl;
import ru.ifmo.kot.track.mvc.service.Impl.UserzServiceImpl;
import ru.ifmo.kot.track.mvc.service.Impl.UwikizServiceImpl;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
public class Run {
    public static void main(String[] args) {
 ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        AnnotationConfiguration config = new AnnotationConfiguration();
       config.addAnnotatedClass(userz.class);
       config.addAnnotatedClass(uwikiz.class);
        config.addAnnotatedClass(qwikiz.class);
        config.addAnnotatedClass(questz.class);
        config.addAnnotatedClass(userquest.class);
        config.addAnnotatedClass(userquestid.class);
        config.configure("hibernate.cfg.xml");
        new SchemaExport(config).create(true,true);
     UserzServiceImpl c = context.getBean(UserzServiceImpl.class);
    UwikizServiceImpl course = context.getBean(UwikizServiceImpl.class);
    QwikizServiceImpl qwc = context.getBean(QwikizServiceImpl.class);
    QuestzServiceImpl qc = context.getBean(QuestzServiceImpl.class);
      userz u,u1;
      questz q,q1;
        qwikiz qw;
        Date d=new Date(2014-12-21);
     uwikiz uw, uw2;
     List<uwikiz> uu;
     //Добавление пользователя
     u=new userz("Браун","123","гость","fuck@mail.ru", d);
     c.addUser(u);
     //Добавления Wiki страницы пользователя
      uw=new uwikiz("Тратата","Большой текст", d, null, c.getByName("Браун"));
      uw2=new uwikiz("Тратата1","Большой текст2", d, null,c.getByName("Браун"));
     course.addUwiki(uw);
     course.addUwiki(uw2);
     //Добавление Задачи
     q=new questz("Задача №1", d, d);
     q.setId(1);
     qc.addQuest(q);
     //Добавление Wiki страницы задачи (не работает)
     qw=new qwikiz("1", "ТЕКСТ", d, d, "ВАЖНО!", "0", "s", null, qc.getById(q.getId()));
     qwc.addQwiki(qw);
     //Добавление связи Задача-Пользователь
       userquest uq = new userquest();
       q1=new questz("Задача №2", d, d);
    u1=new userz("Уайт","12345","админ","admin@mail.ru", d);
        c.addUser(u1);
       u1=c.getByName("Уайт");
        q1=qc.addQuest(q1);
        uq.setUser(u1);
        uq.setQuest(qc.getById(q1.getId()));
        uq.setActual(false);
        u1.getUserQuest().add(uq);
        c.addUser(u1);
        //dd
    }
}
