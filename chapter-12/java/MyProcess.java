import java.io.*;
class MyProcess{
    public static void main(String args[]) throws Exception{
	    Runtime run = Runtime.getRuntime();
		Process p = run.exec("java SubProcess");

		BufferedInputStream in = new BufferedInputStream(p.getInputStream()); 
		BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
		String s; 
		while ((s = br.readLine()) != null) { 
			  System.out.println(s); 
		} 
	}
}
