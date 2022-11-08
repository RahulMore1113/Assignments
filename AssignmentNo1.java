
public class AssignmentNo1 
{
	public static void main(String[] args) 
	{
		
		Que1 q1 = new Que1();
		q1.run();
		
		System.out.println(" ");
		Que2 q2 = new Que2(); 
		q2.run(4);
		 
		System.out.println(" ");
		Que3 q3 = new Que3();
		q3.run();
		
		System.out.println(" ");
		Que4 q4 = new Que4();
		q4.run(10);
		
		System.out.println(" ");
		Que5 q5 = new Que5();
		q5.run();
	}
}

class Que1
{
	void run() 
	{
		System.out.println("Assignment 1 - Que.Ans -1");
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //this part is for I letter
			{
				if((j==(n-1)/2) || i==0 || i==n-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for N letter
			{
				if((i==j) || (j==0) || (j==n-1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for E letter
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for U letter
			{
				if((j==0 && i<n-1) || (j==n-1 && i <n-1)||
						(i==n-1) && j>0 && j<n-1
						)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) // this part is for R letter
			{
				if((i==0 && j<n-1) || 
						j==0 || 
						i==(n-1)/2 && j<(n-1) || 
						(j==n-1 && i>0 && i<(n-1)/2) || 
						i==j && i>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for O letter
			{
				if((i==0 && j>0 && j<n-1)||
						(i==n-1) && j>0 && j<n-1 || 
						(j==0 && i>0 && i<n-1 || 
						(j==n-1) && i>0 && i<n-1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for N letter
			{
				if((i==j) || (j==0) || (j==n-1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


  class Que2 
  {
	  void run(int n) 
	  {
		  System.out.println("Assignment=1 - Que.Ans=2");
		  
		  for(int i=1;i<=n;i++)
		  {
			  for(int j=1;j<=n;j++)
			  {
				  System.out.print(i);
			  }
			  System.out.println(" ");
		  }
	  } 
  } 

class Que3
{
	void run()
	{
		System.out.println("Assignment=1 - Que.Ans=3");
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0) | (j==0) || (i==n-1) || (j==n-1) || i+j<=(n-1)/2 || j-i>=(n-1)/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class Que4
{
	void run(int n)
	{
		System.out.println("Assignment=1 - Que.Ans=4");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i==n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Que5
{
	void run()
	{
		System.out.println("Assignment=1 - Que.Ans=5");
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

