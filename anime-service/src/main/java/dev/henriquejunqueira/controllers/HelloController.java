package dev.henriquejunqueira.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //    acessa esse metodo pela rota (http://localhost:8080/)
//    @GetMapping
//    public String hi(){
//        return "Olá mundo!";
//    }

    //    acessa esse metodo pela rota (http://localhost:8080/hi)
//    @GetMapping("hi")
//    public String hi(){
//        return "Olá mundo!";
//    }

    //    acessando esse metodo pela rota (http://localhost:8080/hi/) dará erro
//    @GetMapping("hi/")
//    public String hi(){
//        return "Olá mundo!";
//    }

    //    acessando esse metodo tanto pela rota (http://localhost:8080/hi/) quanto
    //    pela rota (http://localhost:8080/hi) irá funcionar agora
//    @GetMapping(value = {"hi", "hi/"})
//    public String hi(){
//        return "Olá mundo!";
//    }

    //    acessa esse metodo pela rota (http://localhost:8080/hi)
    @GetMapping("hi")
    public String hi(){
        return "Olá mundo!";
    }
}
