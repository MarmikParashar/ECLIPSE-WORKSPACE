package in.cdac.file;

import java.io.*;

public class DisplayFilesAndDirectories {

	public static void main(String[] args) {
		int count = 0;
		String dirPath = "D:\\Java Files Handling" ;
		File file = new File(dirPath) ;
		String[] fileList = file.list();
		for (String files : fileList) {
			count++;
			System.out.println(files);
			
		}
		System.out.println("Total no. of files : " + count);
		System.out.println();
		
		// List of All Directories 
		int counter = 0 ;
		for (String dir : fileList) {
			File file1 = new File(dirPath,dir);
			if (file1.isDirectory()) {
				counter++;
				System.out.println(dir);
			}
			
			
		}
		System.out.println("Total no. of Directories : " + counter);
		System.out.println();
		
		if (file.isDirectory()) {
			String[] files = file.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".txt");
				}
			});
			System.out.println("Files with extension .txt : \n");
			for (String fileName : files) {
				System.out.println(fileName);
			}
		}
				
		
		
	}

}
