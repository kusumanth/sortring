package sorting;

public class Newsort {

	
		public Newsort(Object object) {
		// TODO Auto-generated constructor stub
	}

		void Newsort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) {
	                   int temp; 
						temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } }
	   
	    void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Newsort ob = new Newsort(null); 
	        int arr[] = {60,92,22,41,29}; 
	        ob.Newsort(arr); 
	        System.out.println("Sorted array"); 
	        ob.printArray(arr); 
	    }

		
	
	}


