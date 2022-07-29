package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {

	
	 public Properties prop;
     public ConfigRead() {
  	   File src=new File("./config.properties");
  	   try {
  		   
  		   FileInputStream fis = new FileInputStream(src);
  		   prop = new Properties();
  		   prop.load(fis);
  		   
  	   }catch(Exception e) {
  		   e.printStackTrace();
  	   }
  	    
     }
     public String getUrl() {
  	   String url = prop.getProperty("url");
  	   return url;
     }
     public String getDriverPath() {
  	   String dp = prop.getProperty("driverpath");
  	   return dp;
     }
     public String getAuthor() {
  	   String aut = prop.getProperty("author");
  	   return aut;
     }
     public String getReportName() {
  	   String rn = prop.getProperty("reportname");
  	   return rn;
     }
     public String getLogName() {
    	 String lg = prop.getProperty("logname");
    	 return lg;
    	 
     }
    
}
