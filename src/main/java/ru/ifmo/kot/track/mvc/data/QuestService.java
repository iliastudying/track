package ru.ifmo.kot.track.mvc.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ilia on 14.12.2014.
 */

@Service
public class QuestService {
    private Map<Integer, Quest> storage = new HashMap<Integer, Quest>();

    public QuestService() {
        storage.put(1, new Quest(1, "Name of another quest", "Lorem Ipsum Dolor Set Amet, Consectetur Adipiscing Elit."));
        storage.put(2, new Quest(2, "Some name", "Lorem Ipsum Dolor Set Amet, Consectetur Adipiscing Elit."));
        storage.put(3, new Quest(3, "Третья задача", "Lorem Ipsum Dolor Set Amet, Consectetur Adipiscing Elit."));
    }

    public Quest getQuestById(Integer id) {
        return storage.get(id);
    }

    public List<Quest> getQuests() {
        List<Quest> list = new ArrayList<Quest>();
        list.addAll(storage.values());
        return list;
    }


}
