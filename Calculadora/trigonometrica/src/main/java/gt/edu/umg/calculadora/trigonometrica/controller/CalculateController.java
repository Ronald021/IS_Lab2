package gt.edu.umg.calculadora.trigonometrica.controller;

import gt.edu.umg.calculadora.trigonometrica.model.OperationModel;
import gt.edu.umg.calculadora.trigonometrica.service.Trigonometric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculateController {
    OperationModel operationModel = new OperationModel();

    @Autowired
    private Trigonometric trigonometric;

    @RequestMapping("/calculatortr")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/calculatortr", params="sin", method = RequestMethod.POST)
    public String sin(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.sin(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatortr", params="cos", method = RequestMethod.POST)
    public String cos(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.cos(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatortr", params="tan", method = RequestMethod.POST)
    public String tan(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.tan(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatortr", params="sec", method = RequestMethod.POST)
    public String sec(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.sec(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatortr", params="cosec", method = RequestMethod.POST)
    public String cosec(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.cosec(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatortr", params="cotg", method = RequestMethod.POST)
    public String cotg(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.cotg(operationModel));
        return "calculator";
    }
}
