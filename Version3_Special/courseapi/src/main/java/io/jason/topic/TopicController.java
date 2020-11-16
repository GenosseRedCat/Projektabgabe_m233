package io.jason.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService; //Marks as something that needs a dependency Injection

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        //Sobald /topics geöffnet wird, werden diese Daten automatisch als JSON ausgegeben.
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") //tells it that id is a variable.
    public Topic getTopic(@PathVariable String id){ //This maps id to id.
        return topicService.getTopic(id);
    }

    //This is to create a new Topic by using a POST request
    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //This is to change an existing Topic by using a PUT request
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    //This is to delete an existing Topic, by using a DELETE request.
    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){ //This maps id to id.
        topicService.deleteTopic(id);
    }
}
