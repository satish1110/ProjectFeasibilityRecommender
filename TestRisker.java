import net.sourceforge.jFuzzyLogic.*;
import net.sourceforge.jFuzzyLogic.rule.*;
import net.sourceforge.jFuzzyLogic.plot.*;
import net.sourceforge.jFuzzyLogic.membership.functions.*;
import net.sourceforge.jFuzzyLogic.*;


import java.util.*;

import org.antlr.runtime.RecognitionException;

import org.*;

public class TestRisker {
    public double risker(double a,double b)
	{
        
        String fileName = "risker.fcl";
        FIS fis = FIS.load(fileName,true);
		FunctionBlock functionBlock = fis.getFunctionBlock(null);


        
        if( fis == null ) 
		{ 
            System.err.println("Can't load file: '" + fileName + "'");
            
        }
         
         
		
     //JFuzzyChart.get().chart(functionBlock);

        
        fis.setVariable("complexity", a);
        fis.setVariable("plan_schedule", b);

        
        fis.evaluate();

        
        Variable risk = functionBlock.getVariable("risk");
      //  JFuzzyChart.get().chart(risk, risk.getDefuzzifier(), true);
         
		
       
       // System.out.println(fis);
    return (fis.getVariable("risk").getValue());
	}
}