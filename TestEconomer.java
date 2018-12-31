import net.sourceforge.jFuzzyLogic.*;
import net.sourceforge.jFuzzyLogic.rule.*;
import net.sourceforge.jFuzzyLogic.plot.*;
import net.sourceforge.jFuzzyLogic.membership.functions.*;
import net.sourceforge.jFuzzyLogic.*;


import java.util.*;

import org.antlr.runtime.RecognitionException;

import org.*;

public class TestEconomer 
{
    public double economer(double a,double b) 
	{
       
        String fileName = "economer.fcl";
        FIS fis = FIS.load(fileName,true);
		FunctionBlock functionBlock = fis.getFunctionBlock(null);


        
        if( fis == null ) 
		{ 
            System.err.println("Can't load file: '" + fileName + "'");
            
        }
          
         
		
		
    //JFuzzyChart.get().chart(functionBlock);

        
        fis.setVariable("cost", a);
        fis.setVariable("equipment_expertise", b);

        
        fis.evaluate();

        
        Variable economic = functionBlock.getVariable("economic");
        //JFuzzyChart.get().chart(economic, economic.getDefuzzifier(), true);

        
        //System.out.println(fis);
    return (fis.getVariable("economic").getValue());
	
	}
}