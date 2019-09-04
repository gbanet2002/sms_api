package nbs.start_stop_svc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
public class AppController {
	
	String html = "<!DOCTYPE html>\n" + 
			"<html>\n" + 
			"<body>\n" + 
			"\n" + 
			"<h1>My First Heading</h1>\n" + 
			"\n" + 
			"<p>My first paragraph.</p>\n" + 
			"\n" + 
			"</body>\n" + 
			"</html>";
	
	@RequestMapping("/")
	public String home() {
		//return "This is NBS Start/Stop Service Central";
		return html;
	}
}
