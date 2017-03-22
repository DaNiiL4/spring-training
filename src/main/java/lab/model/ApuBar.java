package lab.model;

import lab.aop.AopLog;
import lab.model.simple.SimpleSquishy;

public class ApuBar implements Bar {

	public Squishy sellSquishy(Customer customer)  {
        if (customer.broke()){
            throw new CustomerBrokenException();
        }
        AopLog.append("Here is your Squishy \n");
        return new SimpleSquishy("Usual Squishy");
    }
}