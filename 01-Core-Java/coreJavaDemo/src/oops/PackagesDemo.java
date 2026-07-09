package oops;

import oops.tools.AdvCalc;
import oops.tools.Calc;

public class PackagesDemo {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		AdvCalc obj1 = new AdvCalc();

		System.out.println(obj1.multi(2, 10));
		
	}

}
