package com.example.demo.Controller;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Demo.domain.Param;
import com.example.demo.Demo.domain.idreturn;
import com.example.demo.model.Userprofiles;

@RestController
@RequestMapping(value = "api")
public class apiController {
	private Map<String, Userprofiles> userMap;
   
   @PostMapping("/login/v0")
   public idreturn post(@RequestBody Param param) {
	   idreturn idreturn = new idreturn("Success", "AUTH_SUCCESS", 200, "OK");   

       return idreturn;
   }
}
