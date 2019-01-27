package complexnumber;
import java.util.Scanner;

public class Caculator {
	public static void main(String args[]) {
		
		boolean running = true;
		Scanner input = new Scanner(System.in);
		
		while(running) {
			System.out.println("please enter your first complex number");
			String firstCn = input.next();
			ComplexNumber cn1 = convertStr2ComplexNumber(firstCn);
			System.out.println("please enter your second complex number");
			String secondCn = input.next();
			ComplexNumber cn2 = convertStr2ComplexNumber(secondCn);
			System.out.println("what kind of operation you want to do, please enter +, -, * or /");
			String operator = input.next();
			ComplexNumber result= caculate(cn1, cn2, operator);
			if(result!=null) {
				System.out.println(result.toString());
			}else {
				System.out.println("error occurred, please make sure your input is valid");
			}
			
			
			System.out.println("Do you want to do more caculation, please enter yes/or");
			String isContinue = input.next();
			if(isContinue.equalsIgnoreCase("no")) {
				running = false;
				
			}
			
			
		}
		
	}
	
	public static ComplexNumber caculate(ComplexNumber cn1, ComplexNumber cn2, String operator) {
		if(operator.equals("+")) {
			return cn1.add(cn2);
		}
		
		if(operator.equals("-")) {
			return cn1.sub(cn2);
		}
		if(operator.equals("*")) {
			return cn1.times(cn2);
		}
		if(operator.equals("/")) {
			return cn1.div(cn2);
		}
		
		return null;
	}

	private static ComplexNumber convertStr2ComplexNumber(String str) {
		double real = getReal(str);
		double img = getImg(str);
		return new ComplexNumber(real,img);
	}
	
	private static double getReal(String str)
	{
		int position = str.indexOf("+");
		if(position !=-1) {
			String realStr= str.substring(0, position);
			double real = Double.parseDouble(realStr);
			return real; 
		}else {
			position = str.indexOf("-");
			String realStr= str.substring(0, position);
			double real = Double.parseDouble(realStr);
			return real; 
		}
		
	}
	
	private static double getImg(String str) {
		int position = str.indexOf("+");
		if(position !=-1) {
			String imgStr= str.substring(position+1, str.length()-1);
			double img = Double.parseDouble(imgStr);
			return img;
		}else {
			position= str.indexOf("-");
			String imgStr= str.substring(position+1, str.length()-1);
			double img = Double.parseDouble(imgStr);
			return -img;
		}
		
	}
}
