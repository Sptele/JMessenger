package org.sptele.JMessenger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sptele.JMessenger.Entities.Message;

@SpringBootApplication
public class JMessengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JMessengerApplication.class, args);
	}

	@Bean
	CommandLineRunner run() {
		Message msg = new Message("+14086045620", "Hey!");
		Message msg1 = new Message("14086045620", "Hey!");
		Message msg2 = new Message("  1 408-604-5620", "Hey!");
		Message msg3 = new Message("  1 408-604_5620  ", "Hey!");

		return args -> {
			System.out.println(msg);
			System.out.println(msg1);
			System.out.println(msg2);
			System.out.println(msg3);
		};
	}

}
