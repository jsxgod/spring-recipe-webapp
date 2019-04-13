package js.springexamples.recipeapp.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotFoundController implements ErrorController {


    @RequestMapping("/error")
    public String getErrorPage(){

        return "404";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
