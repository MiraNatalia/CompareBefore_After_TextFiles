
package com.simplecode.jdbc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CompareBefore_After_TextFiles 
{
        public static void main(String[] args) throws Exception 
        {
        	
        	File folderBefore = new File("C:\\Totest\\Before");
        	File folderAfter = new File("C:\\Totest\\After");
            
        	String beforeDeployment[] = folderBefore.list();
        	String afterDeployment[] = folderAfter.list();
        	
        	for (int i = 0; i < beforeDeployment.length; i++) {
        		
        		File fileBefore = new File ("C:\\Totest\\Before\\" + beforeDeployment[i]);
        		File fileAfter = new File ("C:\\Totest\\After\\" + afterDeployment[i]);
        		
        		compareTextFiles(fileBefore,fileAfter );
        		
        	}
        	     	
                
        }
           
        
        public  static void  compareTextFiles(File vFileBefore, File vFileAfter) 
        {
        	
        	boolean compareResult = false;
        	       	
        	try {
				String beforeFile = FileUtils.readFileToString(vFileBefore);
				String afterFile = FileUtils.readFileToString(vFileAfter);
				compareResult = beforeFile.equals(afterFile);
				System.out.println(vFileBefore.getName()+ " 555555555555555555555555" + beforeFile + "333");
				System.out.println(vFileAfter.getName()+ " 555555555555555555555555" + afterFile + "333");
				System.out.println("Are the files are same? " + vFileBefore.getName()+ " vs " + vFileAfter.getName()+ "  " + compareResult);
//				System.out.println(vFileBefore.getName()+ " content: " + beforeFile);
//				System.out.println(vFileAfter.getName()+ " content: " + afterFile);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	               
        }
        
        
        
        
        
        
        
        
        
        
}