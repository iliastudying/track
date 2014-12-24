package ru.ifmo.kot.track.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ifmo.kot.track.mvc.temp.QuestService;

/**
 * Created by Ilia on 14.12.2014.
 */
@Controller
public class BaseController {
    private QuestService questService;

    @Autowired
    public BaseController(QuestService questService) {
        this.questService = questService;
    }

    @RequestMapping("/")
    public String list(ModelMap model) {
        model.put("quests", questService.getQuests());
        return "list";
    }

    @RequestMapping("/quest/{id}")
    public String detail(@PathVariable(value = "id") Integer questId, ModelMap model) {
        model.put("quest", questService.getQuestById(questId));
        return "detail";
    }

}
