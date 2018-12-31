
import net.sourceforge.jFuzzyLogic.*;
import net.sourceforge.jFuzzyLogic.rule.*;
import net.sourceforge.jFuzzyLogic.plot.*;
import net.sourceforge.jFuzzyLogic.membership.functions.*;
import net.sourceforge.jFuzzyLogic.*;


import java.util.*;

import org.antlr.runtime.RecognitionException;

import org.*;

public class TestFeasibler 
{
    public static void main(String[] args) throws Exception {
 
       String fileName = "feasibler.fcl";
        FIS fis = FIS.load(fileName,true);
		FunctionBlock functionBlock = fis.getFunctionBlock(null);


      
        if( fis == null ) { 
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }
		
		double r,e;
          Scanner sc=new Scanner(System.in);
       
		double ae,be;
		System.out.println("enter cost(0 to 10):");
		ae=sc.nextDouble();
		
		System.out.println("\n enter equipment_expertise required(0 to 10):");
		be=sc.nextDouble();
		
		double ar,br;
		System.out.println("enter complexity(0 to 10):");
		ar=sc.nextDouble();
		
		System.out.println("\n enter plan_schedule required(0 to 10):");
		br=sc.nextDouble();
		
	TestRisker tr = new TestRisker();
			TestEconomer te = new TestEconomer();
		r=tr.risker(ar,br);
		e=te.economer(ae,be);
	
	
		
		
    JFuzzyChart.get().chart(functionBlock);

      
        fis.setVariable("risk", r);
        fis.setVariable("economic", e);
 
        
              fis.evaluate();
double f=fis.getVariable("feasibility").getValue();
       
        Variable feasibility = functionBlock.getVariable("feasibility");
        JFuzzyChart.get().chart(feasibility, feasibility.getDefuzzifier(), true);

       
        System.out.println(fis);
		System.out.println(f);
    }
}	