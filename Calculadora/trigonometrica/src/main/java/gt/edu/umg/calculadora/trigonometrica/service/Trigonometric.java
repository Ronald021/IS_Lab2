package gt.edu.umg.calculadora.trigonometrica.service;

import gt.edu.umg.calculadora.trigonometrica.model.OperationModel;
import org.springframework.stereotype.Service;

@Service
public class Trigonometric {
    public double sin(OperationModel model){
        return Math.sin(model.getA());
    }
    public double cos(OperationModel model){
        return Math.cos(model.getA());
    }
    public double tan(OperationModel model){
        return Math.tan(model.getA());
    }
    public double sec(OperationModel model){
        return 1/Math.cos(model.getA());
    }
    public double cosec(OperationModel model){
        return 1/Math.sin(model.getA());
    }
    public double cotg(OperationModel model){
        return 1/Math.tan(model.getA());
    }
}
