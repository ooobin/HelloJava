package com.example.hellojava.websocket;

import com.example.hellojava.model.websocket.Greeting;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {

    @MessageMapping("/hello") // Maps messages sent to "/app/hello" to this method
    @SendTo("/topic/greetings") // Sends the return value of this method to "/topic/greetings"
    public String greeting(Greeting greeting) {
        return "Hello, " + greeting.getMessage() + "!";
    }
}
