package com.xiaolu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@Controller
@SpringBootApplication
public class App 
{

    @RequestMapping("/main")
    public String index(Model model) {
        Person person = new Person();
        person.setName("zhou");
        model.addAttribute("person", person);
        return "main";
    }
    public static void main( String[] args )
    {

        SpringApplication.run(App.class, args);
    }
}
