import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


public class Core {
	public static String Execute(String code){
		String output = "";
		String[] arg = {"\"" + code + "\""};
		try{
		      String line;
		      Process p = Runtime.getRuntime().exec(getCurrentDirectory() + "jtnr.exe", arg);
		      BufferedReader input = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		      while ((line = input.readLine()) != null){
		        output += line + "\n";
		      }
		      input.close();
		    }catch(Exception err){
		      err.printStackTrace();
		    }
		return output;
	}
	
	public static void main(String[]args){
		System.out.print(Execute("hello there"));
	}
	
	private static String getCurrentDirectory(){
		try {
	        return URLDecoder.decode(ClassLoader.getSystemClassLoader().getResource(".").getPath(), "UTF-8").substring(1);
	    } catch (UnsupportedEncodingException e) {
	        return "";
	    }
	}
}