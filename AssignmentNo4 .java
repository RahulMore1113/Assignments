import java.util.Arrays;
import java.util.Scanner;

class Switch1
{
	void Run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Select the following option");
		System.out.println("1: Program to remove Duplicates from a String.(Take any String ex with duplicates character).");
		System.out.println("2: Program to print Duplicates characters from the String.");
		System.out.println("3: Program to check if “2552” is palindrome or not.");
		System.out.println("4: Program to count the number of consonants, vowels, special characters in a String.");
		System.out.println("5: Program to implement Anagram Checking least inbuilt methods being used.");
		System.out.println("6: Program to implement Pangram Checking with least inbuilt methods being used.");
		System.out.println("7: Program to find if String contains all unique characters.");
		System.out.println("8: Program to find the maximum occurring character in a String.");
		System.out.println("Enter the choise");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1 :
			System.out.println("----------------------------------------------------------------------------");
			Q1 q1 = new Q1();
			q1.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 2 :
			System.out.println("----------------------------------------------------------------------------");
			Q2 q2 = new Q2();
			q2.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 3 : 
			System.out.println("----------------------------------------------------------------------------");
			Q3 q3 = new Q3(); 
			q3.Run(); 
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 4 : 
			System.out.println("----------------------------------------------------------------------------");
			Q4 q4 = new Q4(); 
			q4.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 5 : 
			System.out.println("----------------------------------------------------------------------------");
			Q5 q5 = new Q5(); 
			q5.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 6 : 
			System.out.println("----------------------------------------------------------------------------");
			Q6 q6 = new Q6(); 
			q6.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 7 : 
			System.out.println("----------------------------------------------------------------------------");
			Q7 q7 = new Q7(); 
			q7.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		case 8 : 
			System.out.println("----------------------------------------------------------------------------");
			Q8 q8 = new Q8(); 
			q8.Run();
			System.out.println("----------------------------------------------------------------------------");
			break;
		default :
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Enter valid choice");
			System.out.println("----------------------------------------------------------------------------");
			break;
		}
	}
}

class Q1
{
	void Run()
	{
		String s = "ineuron";
		String temp = "" + s.charAt(0);
		for (int i = 1; i < s.length(); i++) 
		{
			if (!temp.contains(String.valueOf(s.charAt(i))))
				temp = temp + s.charAt(i);
		}
		System.out.println(temp);
	}
}

class Q2
{
	void Run()
	{
		String str = "beautiful beach";
	    char[] carray = str.toCharArray();
	    System.out.println("The string is:" + str);
	    System.out.print("Duplicate Characters in above string are: ");
	    for (int i = 0; i < str.length(); i++) 
	    {
	    	for (int j = i + 1; j < str.length(); j++) 
	    	{
	    		if (carray[i] == carray[j]) 
	    		{
	    			System.out.print(carray[j] + " ");
	    			break;
	    		}   
	        }
	    }
	}
}

class Q3
{
	void Run()
	{
		int r,sum=0,temp;
		int n=2552;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number ");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}

class Q4
{
	void Run()
	{
		String str = "Rahul is my name 1113";
		int vowels = 0, consonant = 0, specialChar = 0,digit = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
			{
				// To handle upper case letters
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					vowels++;
				}
				else
				{
					consonant++;
				}
			}
			else if (ch >= '0' && ch <= '9')
			{
				digit++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonant: " + consonant);
		System.out.println("Digit: " + digit);
		System.out.println("Special Character: " + specialChar);
	}
}

class Q5
{
	void Run()
	{
		String s1="Rahul is my name";
		String s2="My name is Rahul";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
	}
}

class Q6
{
	void Run()
	{
		boolean t=false;
		String s1="RAHUL IS MY NAME";
		
		s1=s1.replace(" ", "");
		
		char[] ch=s1.toCharArray();
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				t=true;
			}
		}
		if(t==false)
		{
		System.out.println("It's pangram");
		}
	}
}

class Q7
{
	void Run()
	{
		String input = "GeeksforGeeks";
		if (uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
	boolean uniqueCharacters(String str)
	{
		// If at any time we encounter 2 same
		// characters, return false
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;
		// If no duplicate characters encountered,
		return true;
	}
}

class Q8
{
	static final int ASCII_SIZE = 256;
	
	void Run()
	{
		String str = "sample string";
		System.out.println("Max occurring character is "+ getMaxOccurringChar(str));
	}
	
	static char getMaxOccurringChar(String str)
	{
		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
			int max = -1;
			char result = ' ';
		for (int i = 0; i < len; i++) 
		{
			if (max < count[str.charAt(i)]) 
			{
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}

public class AssignmentNo4 {
	public static void main(String[] args) {
		Switch1 s = new Switch1();
		s.Run();
	}
}
