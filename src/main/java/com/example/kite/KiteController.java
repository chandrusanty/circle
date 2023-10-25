package com.example.kite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KiteController {
@GetMapping("hi")
public String gethi() {
	return "money";
}
}
