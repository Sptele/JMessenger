package org.sptele.JMessenger.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.sptele.JMessenger.Entities.Message;
import org.sptele.JMessenger.Sender;

@RestController
public class MessageController {
    @GetMapping("/api/messages-router")
    ResponseEntity<String> getMessages() {

        final String getMessage = "Hey, you seem to be a little lost! You somehow found this page, but for your info, this is the backend" +
                "api used when you send a message. We communicate through this with the server to send data all over" +
                "the globe.";

        return new ResponseEntity<>(getMessage, HttpStatus.OK);
    }

    @PostMapping("/api/messages-router")
    ResponseEntity<Message> sendMessage(@RequestBody Message msg) {
        if (msg == null)
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

        boolean response = Sender.sendMessage(msg);

        return new ResponseEntity<>(msg, response ? HttpStatus.ACCEPTED : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
