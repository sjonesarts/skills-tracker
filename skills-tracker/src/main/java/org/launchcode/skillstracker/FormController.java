package org.launchcode.skillstracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @GetMapping("form")
    @ResponseBody
    public String FormPage(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<label for=name>Enter Name </label>"+
                        "<input type = 'text' name = 'coder' />" +
                        "<p></p>"+

                        "<label for=favorite language>Choose a favorite language:</label>" +
                        "<select name=language1 id=language1>" +
                        "<option value=Java>Java</option>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Python>Python</option>"+
                        "</select>" +
                        "<p></p>" +
                        "<label for=second favorite language>Choose a second favorite language:</label>" +
                        "<select name=language2 id=language2>" +
                        "<option value=Java>Java</option>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Python>Python</option>"+
                        "</select>" +
                        "<p></p>" +

                        "<label for=third favorite language>Choose a third favorite language:</label>" +
                        "<select name=language3 id=language3>" +
                        "<option value=Java>Java</option>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Python>Python</option>"+
                        "</select>" +
                        "<p></p>" +

                        "<input type = 'submit' value = 'Submit!' />" +
                        "</form></body>" +

                        "</html>";
   return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String hello(@RequestParam String coder, @RequestParam String language1, @RequestParam String language2,@RequestParam String language3){
        return "<html>" +
                "Hello" + coder + "! Here are your rankings:" + "<br>" +
                "Favorite: " + language1 + "<br>" +
                "Second Favorite: " + language2 + "<br>" +
                "Third Favorite: " + language3 + "<br>" +

                "</html>";

    }
}
