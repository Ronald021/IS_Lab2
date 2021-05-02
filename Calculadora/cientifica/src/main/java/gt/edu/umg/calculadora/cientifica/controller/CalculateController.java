package gt.edu.umg.calculadora.cientifica.controller;

import gt.edu.umg.calculadora.cientifica.model.OperationModel;
import gt.edu.umg.calculadora.cientifica.service.Scientific;
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
    private Scientific scientific;

    @RequestMapping("/calculatorsc")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="pi", method = RequestMethod.POST)
    public String pi(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.pi(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="expc", method = RequestMethod.POST)
    public String expc(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.exp(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="abs", method = RequestMethod.POST)
    public String abs(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.abs(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="mod", method = RequestMethod.POST)
    public String mod(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.mod(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="fact", method = RequestMethod.POST)
    public String fact(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.fact(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="log", method = RequestMethod.POST)
    public String log(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.log(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/calculatorsc", params="logn", method = RequestMethod.POST)
    public String logN(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.logNatural(operationModel));
        return "calculator";
    }
}
