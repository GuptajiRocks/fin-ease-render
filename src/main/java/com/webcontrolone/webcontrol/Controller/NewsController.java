package com.webcontrolone.webcontrol.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
    @RequestMapping("/news")
    public String getNews() {
        return "news";
    }
}
