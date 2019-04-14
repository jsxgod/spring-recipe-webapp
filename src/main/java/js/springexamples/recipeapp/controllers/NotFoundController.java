package js.springexamples.recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class NotFoundController implements ErrorController {


    @RequestMapping("/error")
    public String getErrorPage(){
        log.debug("getting 404");
        return "404";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
