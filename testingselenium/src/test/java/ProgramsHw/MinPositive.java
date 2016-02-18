package ProgramsHw;

public class MinPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr1[] = {8,6,8,-4, -1, 5, 8,20, 4,6};
          int min = 0;
          for ( int i =0 ; i<arr1.length-1 ; i++)
          {
        	 for ( int j=0; j<i ; j++)
        	 {
        	  if ( arr1[i] > 0  )
        	  {
        		  min = arr1[i];
        		  if ( arr1[i] > arr1[i+1])
        		  {
        			  min = arr1[i+1];
        		
        		  }
        	  }
        	  
        	 }
        	  
          }
          
          System.out.println(min);
	}

}
