import java.util.Arrays;
import java.util.Scanner;

class Switch
{
	void Run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Select the following option");
		System.out.println("1: Program to find the duplicates present in an array.");
		System.out.println("2: Program to sort an array using Quick Sort Algorithm.");
		System.out.println("3: Program to sort an array using Bubble Sort Algorithm.");
		System.out.println("4: Program to sort an array using Merge Sort Algorithm.");
		System.out.println("5: Program to sort an array using Selection Sort Algorithm.");
		System.out.println("6: Program to check whether an array is a subset of another array.");
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
		System.out.println("Assignment 2 - Que.Ans -1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array which you want");
		int m=sc.nextInt();
		int n=m;
		System.out.println();
		System.out.println("Size of your array is "+n);
		System.out.println();
		int[] ar=new int[n];
		for(int i=0; i<ar.length;i++)
		{
		  System.out.println("Please Enter valus to store in array "+ i);
		  ar[i]=sc.nextInt();
		}
		System.out.println("The values of arrays are as follows");
		for(int arr:ar)
		{
			System.out.print(arr+"");
		}
		
		boolean flag=false;
		System.out.println();
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("Key "+key+" found at index " + i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
		System.out.println("Key not found");
		}
	}
}

class Q2
{
	void Run() 
	{
		System.out.println("Assignment 2 - Que.Ans -2");
		int [] ar = {98,56,34,3,24,22,10};
        for (int i=0; i<ar.length; i++)
        {

            for (int j=ar.length-1; j>=0; j--)
            {
                if (ar[i] > ar[j])
                {
                    int temp = ar[i];
                    ar[i]= ar[j];
                    ar[j]= temp;
                    System.out.println(i+ " " +j);
                    System.out.print(ar[i] + " " + ar[j]);

                }
                else if (ar[i] <= ar[j])
                        {
                    System.out.println(i+ " " +j);
                            System.out.println("Greater or equal");
                        }
                System.out.println();
            }
        }

        for (int a : ar)
        {
            System.out.print(a + " ");

        }
        System.out.println("  ");

	}
}


class Q3
{
	void Run() 
	{
		System.out.println("Assignment 1 - Que.Ans -3");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array which you want");
		int m=sc.nextInt();
		int n=m;
		System.out.println();
		System.out.println("Size of your array is "+n);
		System.out.println();
		int[] ar=new int[n];
		
		for(int i=0; i<ar.length;i++)
		{
		  System.out.println("Please Enter valus to store in array "+ i);
		  ar[i]=sc.nextInt();
		}
		System.out.println("The values of arrays are as follows");
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j]<ar[j-1])
				{
					int tempVar=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=tempVar;
				}
			}
		}
		
		for(int arr:ar)
		{
			System.out.print(arr+" ");
		}
	}
}

class Q4
{
	void Run() 
	{
		System.out.println("Assignment 1 - Que.Ans -4");
		 int arr[] = {9,8,7,6,5,4,3,2,15};
	      int n = arr.length;
	      System.out.println("Before sorting:");
	      System.out.println(Arrays.toString(arr));

	      sort(arr,0,n-1);

	      System.out.println("After sorting:");

	      for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	      }
	      System.out.println();


	    }
	 public static void sort(int nums[],int start,int end){
	    if(start>=end){
	        return;
	    }
	    int mid=start+(end-start)/2;
	    sort(nums,start,mid);
	    sort(nums,mid+1,end);
	    merge(nums,start,mid,end);
	 }
	 public static void merge(int nums[],int start,int mid,int end)
	 {
	    int merged[]=new int[end-start+1];
	    int index1=start;
	    int index2=mid+1;
	    int x=0;

	    while(index1<=mid && index2<=end){
	        if(nums[index1]<=nums[index2]){
	            merged[x++]=nums[index1++];
	          }
	          else{
	            merged[x++]=nums[index2++];
	          }
	    }
	    while(index1<=mid)
	    {
	        merged[x++]=nums[index1++];
	    }
	    while(index2<=end)
	    {
	        merged[x++]=nums[index2++];
	    }
	    for(int i=0,j=start;i<merged.length;i++,j++)
	    {
	        nums[j]=merged[i];
	    }
	}
}

class Q5
{
	void Run() 
	{
		System.out.println("Assignment 2 - Que.Ans -5");
		int size, i, j, temp;  
	    int arr[] = new int[50];  
	    Scanner scan = new Scanner(System.in);  
	    System.out.print("Enter Array Size : ");  
	    size = scan.nextInt();  
	    System.out.print("Enter Array Elements : ");  
	    for(i=0; i<size; i++)  
	    {  
	        arr[i] = scan.nextInt();  
	    }  
	    System.out.print("Sorting Array using Selection Sort Technique..\n");  
	    for(i=0; i<size; i++)  
	    {  
	        for(j=i+1; j<size; j++)  
	        {  
	            if(arr[i] > arr[j])  
	            {  
	                temp = arr[i];  
	                arr[i] = arr[j];  
	                arr[j] = temp;  
	            }  
	        }  
	    }
	    System.out.print("Now the Array after Sorting is :\n");  
	    for(i=0; i<size; i++)  
	    {  
	        System.out.print(arr[i]+ "  ");  
	    }    
	}
}

class Q6
{
	void Run() 
	{
		System.out.println("Assignment 2 - Que.Ans -6");
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
 
        int m = arr1.length;
        int n = arr2.length;
 
        if (isSubset(arr1, arr2, m, n))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println("arr2 is not a subset of arr1");
    }

	private boolean isSubset(int[] arr1, int[] arr2, int m, int n) 
	{
		int i = 0, j = 0;
		if (m < n)
			return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		while (i < n && j < m) 
		{
			if (arr1[j] < arr2[i])
				j++;
			else if (arr1[j] == arr2[i]) 
			{
				j++;
				i++;
			}
			else if (arr1[j] > arr2[i])
				return false;
		}

		if (i < n)
			return false;
		else
			return true;
    }
}


public class AssignmentNo2 
{
	public static void main(String[] args) 
	{
		Switch s = new Switch();
		s.Run();
	}
}
