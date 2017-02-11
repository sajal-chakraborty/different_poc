package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	class Message {
		private String message;

		public Message(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

	@RequestMapping(path = "/echo/{message}", method = RequestMethod.GET)
	public Message echo(@PathVariable("message") String message) {
		return new Message(message);
	}
}
