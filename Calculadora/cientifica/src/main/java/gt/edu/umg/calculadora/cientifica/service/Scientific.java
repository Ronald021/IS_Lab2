package gt.edu.umg.calculadora.cientifica.service;

import gt.edu.umg.calculadora.cientifica.model.OperationModel;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.springframework.stereotype.Service;

@Service
public class Scientific {

    public double pi(OperationModel model){
        return Math.PI;
    }
    public double exp(OperationModel model){
        System.out.println(Math.pow(model.getA(),2));
        return Math.pow(model.getA(),2);
    }
    public double abs(OperationModel model){
        return Math.abs(model.getA());
    }
    public double mod(OperationModel model){
        return model.getA() % model.getB();
    }
    public long fact(OperationModel model){
       return CombinatoricsUtils.factorial(model.getA());
    }
    public double log(OperationModel model){
        return Math.log10(model.getA());
    }
    public double logNatural(OperationModel model){
        return Math.log(model.getA());
    }
}

