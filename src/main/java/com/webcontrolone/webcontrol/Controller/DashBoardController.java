package com.webcontrolone.webcontrol.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashBoardController {
    @RequestMapping("/main")
    public String opendash() {
        return "dashboard";
    }

    @RequestMapping("/analytics")
    public String openAnalytics() {
        return "analytics";
    }

    @RequestMapping("/analytics2")
    public String openFinAn() {
        return "analytics2";
    }

    @RequestMapping("/investments")
    public String openinv() {
        return "investments";
    }
}
