package project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberToWord2 {
	
	public String convert(int n)
	{
		String str="";
		
		while(n!=0)
		{
						
			if(n==1)
			{
				str=str+" One";
				n=0;
			}
			else if(n==2)
			{
				str=str+" Two";
				n=0;
			}
			else if(n==3)
			{
				str=str+" Three";
				n=0;
			}
			else if(n==4)
			{
				str=str+" Four";
				n=0;
			}
			else if(n==5)
			{
				str=str+" Five";
				n=0;
			}
			else if(n==6)
			{
				str=str+" Six";
				n=0;
			}
			else if(n==7)
			{
				str=str+" Seven";
				n=0;
			}
			else if(n==8)
			{
				str=str+" Eight";
				n=0;
			}
			else if(n==9)
			{
				str=str+" Nine";
				n=0;
			}
			else if(n==10)
			{
				str=str+" Ten";
				n=0;
			}
			else if(n==11)
			{
				str=str+" Eleven";
				n=0;
			}
			else if(n==12)
			{
				str=str+" Twelve";
				n=0;
			}
			else if(n==13)
			{
				str=str+" Thirteen";
				n=0;
			}
			else if(n==14)
			{
				str=str+" Fourteen";
				n=0;
			}
			else if(n==15)
			{
				str=str+" Fifteen";
				n=0;
			}
			else if(n==16)
			{
				str=str+" Sixteen";
				n=0;
			}
			else if(n==17)
			{
				str=str+" Seventeen";
				n=0;
			}
			else if(n==18)
			{
				str=str+" Eighteen";
				n=0;
			}
			else if(n==19)
			{
				str=str+" Nineteen";
				n=0;
			}
			else if(n>=20 && n<30)
			{
				str=str+" Twenty";
				n=n-20;
			}
			else if(n>=30 && n<40)
			{
				str=str+" Thirty";
				n=n-30;
			}
			else if(n>=40 && n<50)
			{
				str=str+" Fourty";
				n=n-40;
			}
			else if(n>=50 && n<60)
			{
				str=str+" Fifty";
				n=n-50;
			}
			else if(n>=60 && n<70)
			{
				str=str+" Sixty";
				n=n-60;
			}
			else if(n>=70 && n<80)
			{
				str=str+" Seventy";
				n=n-70;
			}
			else if(n>=80 && n<90)
			{
				str=str+" Eighty";
				n=n-80;
			}
			else if(n>=90 && n<100)
			{
				str=str+" Ninety";
				n=n-90;
			}
			
			
			else if(n>=100 && n<1000)
			{
				str=str+oneToHundred(n/100);
				str=str+" Hundred";
				n=n%100;
			}
			else if(n>=1000 && n<90000)
			{
				str=str+oneToHundred(n/1000);
				str=str+" Thousand ";
				n=n%1000;
			}
			else if(n>=90000 && n<9000000)
			{
				str=str+oneToHundred(n/100000);
				str=str+" Lakh ";
				n=n%100000;
			}
			else if(n>=9000000 && n<900000000)
			{
				str=str+oneToHundred(n/10000000);
				str=str+" Crore ";
				n=n%10000000;
			}
		}
		return (str);
	}
  private String oneToHundred(int n)
  {
	  
			String str="";
				
			while(n!=0)
			{
				if(n==1)
				{
					str=str+" One";
					n=0;
				}
				else if(n==2)
				{
					str=str+" Two";
					n=0;
				}
				else if(n==3)
				{
					str=str+" Three";
					n=0;
				}
				else if(n==4)
				{
					str=str+" Four";
					n=0;
				}
				else if(n==5)
				{
					str=str+" Five";
					n=0;
				}
				else if(n==6)
				{
					str=str+" Six";
					n=0;
				}
				else if(n==7)
				{
					str=str+" Seven";
					n=0;
				}
				else if(n==8)
				{
					str=str+" Eight";
					n=0;
				}
				else if(n==9)
				{
					str=str+" Nine";
					n=0;
				}
				else if(n==10)
				{
					str=str+" Ten";
					n=0;
				}
				else if(n==11)
				{
					str=str+" Eleven";
					n=0;
				}
				else if(n==12)
				{
					str=str+" Twelve";
					n=0;
				}
				else if(n==13)
				{
					str=str+" Thirteen";
					n=0;
				}
				else if(n==14)
				{
					str=str+" Fourteen";
					n=0;
				}
				else if(n==15)
				{
					str=str+" Fifteen";
					n=0;
				}
				else if(n==16)
				{
					str=str+" Sixteen";
					n=0;
				}
				else if(n==17)
				{
					str=str+" Seventeen";
					n=0;
				}
				else if(n==18)
				{
					str=str+" Eighteen";
					n=0;
				}
				else if(n==19)
				{
					str=str+" Nineteen";
					n=0;
				}
				else if(n>=20 && n<30)
				{
					str=str+" Twenty";
					n=n-20;
				}
				else if(n>=30 && n<40)
				{
					str=str+" Thirty";
					n=n-30;
				}
				else if(n>=40 && n<50)
				{
					str=str+" Fourty";
					n=n-40;
				}
				else if(n>=50 && n<60)
				{
					str=str+" Fifty";
					n=n-50;
				}
				else if(n>=60 && n<70)
				{
					str=str+" Sixty";
					n=n-60;
				}
				else if(n>=70 && n<80)
				{
					str=str+" Seventy";
					n=n-70;
				}
				else if(n>=80 && n<90)
				{
					str=str+" Eighty";
					n=n-80;
				}
				else if(n>=90 && n<100)
				{
					str=str+" Ninety";
					n=n-90;
				}
			}
			return str;	
			
  }
	
	public static void main(String[] args) {
		 NumberToWord2 t=new NumberToWord2();
		 BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("C:\\Users\\Vaibhav Gavade\\Desktop\\project.txt"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
			
		
			Pattern pt=Pattern.compile("[0-9]+");
			
			Matcher m;
			System.out.format("%-10s%s%n", "Number","| Text Representation");
			try {
				while(bf.ready())
				{
					String line = null;
					try {
						line = bf.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					while(line!=null)
					{
						m=pt.matcher(line);
						if(m.find())
						{
							String grpLine=m.group();
							
							int num=Integer.parseInt(grpLine);
//							System.out.println(num+" : "+t.convert(num));
							String str=": "+t.convert(num);
							System.out.format("%-10d%s%n", num,str);
							
						   
						}
						 try {
							line=bf.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 

		 
	
	
	}

}
