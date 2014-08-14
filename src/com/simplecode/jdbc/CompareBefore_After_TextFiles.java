
package com.simplecode.jdbc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CompareBefore_After_TextFiles 
{
        public static void main(String[] args) throws Exception 
        {
        	
        	File folderBefore = new File("C:\\Natalia\\Work\\NNA ODM Response Reporting\\ToTest\\National\\Before");
        	File folderAfter = new File("C:\\Natalia\\Work\\NNA ODM Response Reporting\\ToTest\\National\\After");
            
        	String beforeDeployment[] = folderBefore.list();
        	String afterDeployment[] = folderAfter.list();
        	
        	for (int i = 0; i < beforeDeployment.length; i++) {
        		
        		File fileBefore = new File ("C:\\Natalia\\Work\\NNA ODM Response Reporting\\ToTest\\National\\Before\\" + beforeDeployment[i]);
        		File fileAfter = new File ("C:\\Natalia\\Work\\NNA ODM Response Reporting\\ToTest\\National\\After\\" + afterDeployment[i]);
        		
        		compareTextFiles(fileBefore,fileAfter );
        		
        	}
        	     	
                
        }
           
        
        public  static void  compareTextFiles(File vFileBefore, File vFileAfter) 
        {
        	
        	boolean compareResult = false;
			try {
				compareResult = FileUtils.contentEquals(vFileBefore, vFileAfter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Are the files are same? " + vFileBefore.getName()+ " vs " + vFileAfter.getName()+ "  " + compareResult);
                
        }
        
        
        
        
        
        
        
        
        
        
}