import java.util.*; 

public class vector {
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);    	   	
    	int x,y;
    	int aux3=0;
    	int aux4=0;
    	float aux;
    	float aux2;
    	String s;
    	float vector[]=new float[3];
    	float vector1[]=new float[3];
    	int matriz[][]=new int [3][3];
    	
    	System.out.println("ingresa los datos");
    	for(x=0;x<3;x++)
    	{
    	
    		for(y=0;y<3;y++)
    		{
    			System.out.println("las cantidades son:"+ x +" "+y);
    			s=sc.nextLine();
    	        matriz[x][y]=Integer.parseInt(s);
    		}
    	}
    	System.out.println("la matriz es:");
    	
        	for(x=0;x<3;x++)
         	{
         		
    		for(y=0;y<3;y++)
    		{
    	  	      System.out.print(" "+matriz[x][y]);
    		}
    		System.out.println(" ");
    	}
    	System.out.println("la suma de los renglones");
    	
    	   for(x=0;x<3;x++)
    	   {
    		  aux=0;
    		  
    		  for(y=0;y<3;y++)
    		  {
    	    		aux = aux + matriz[x][y];
    		  }
    		  
    		  System.out.println(" "+aux);
    		 
		   	vector[x]=aux/3;    			
    	   }
    	  System.out.println("la suma de las columnas");
    	  
    	   for(y=0;y<3;y++)
    	   	{
    		  aux2=0;
    		  
    		  for(x=0;x<3;x++)
    		  {
    	    		aux2 = aux + matriz[x][y];
    		  }
    		  
    		  System.out.println(" "+aux2);
    		  
    	   	vector1[y]=aux2/3;   
    	   		}
    		  
    	 System.out.println("el promedio de los renglones es: ");  
    	 	  	     	    		    		 
    	      for(x=0;x<3;x++)
    	   {
    	    	System.out.println(" "+vector[x]);
    	   }
    	 System.out.println("el promedio de las columnas es: ");    
    	 	 	     	    		    		 
    	 for(y=0;y<3;y++)
    	   {
    	     	System.out.println(" "+vector1[y]);
    	   }
    	 	for(aux3=0;aux3<3;aux3++)	
    	 	{
    	 	for(x=0;x<3;x++)
    	   {
    		  
    		  for(y=0;y<3;y++)
    		  {
    		  	
    	    aux = aux + matriz[x][y];
    		  }
    		  
    	 	}
    	
    }
}
}








