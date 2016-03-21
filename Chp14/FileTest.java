import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		try {
		
			File dir = new File("New Folder");			
		
			// get parent file
			File parent = dir.getAbsoluteFile().getParentFile();
			System.out.println(parent.getName());
		
		
			// create new directory
// 			dir.mkdir();
// 	
	
			// List the contents of a directory
			if (parent.isDirectory()) {
				String[] dirContents = parent.list();
				for (int i = 0; i < dirContents.length; i++) {
					System.out.println(dirContents[i]);
				}
			}	


			// get absolute path
			System.out.println(dir.getAbsolutePath());
			
			
			// delete file or directory (returns true if successful)
// 			boolean isDeleted = dir.delete();

			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
}