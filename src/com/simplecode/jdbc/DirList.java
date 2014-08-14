package com.simplecode.jdbc;
import java.io.File;

public class DirList {
	
    	
    	File folder = new File("/BeforeDeployment");
    	
    
    	String before_deployment[] = folder.list();

   
        for(int i = 0; i < before_deployment.length; i++){
            System.out.println(before_deployment[i]);
        }
}
