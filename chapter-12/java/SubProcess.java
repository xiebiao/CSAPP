import java.io.*;
class SubProcess{
    public static void main(String args[]) throws Exception{
		System.out.println(SubProcess.class.getName() +" be called.");
		// read from parent process
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
     	while(true){
	    	String line = bfr.readLine();
	    		System.out.println(line);
	    	if(line != null){
	    		System.out.println(line);
	        }else{
			    System.out.println("input is null");
			}	
	   }
   }
}
