public class FileSystem {

    /*
     * 10.	A files system is a way of storing data on a storage device. 
     * The data is organised in computer files and folders. 
     * A folder is a container, where many files can be placed. 
     * Create a class diagram that shows classes for a folder and file, 
     * their attributes and methods, and their relationships. 
     * Assume that a folder can contain any number of files and does 
     * not contain other folders. Then, define the classes, 
     * their attributes and methods. To store any number of 
     * files in a folder, you can use a resizable array such as ArrayList. 
     * Finally, write a program that:
    a.	Creates a folder
    b.	Adds two files to the folder
    c.	Displays the folder contents
    d.	Adds another file to the folder
    e.	Displays the folder contents 
    f.	Removes the named file from the folder
    g.	Displays the folder contents 
     */
    
    public static void main(String[] args) {
        Folder folder = new Folder("MyFolder");

        File file1 = new File("Doc1.txt", 1024);
        File file2 = new File("Image.jpg", 2048);
        folder.addFile(file1);
        folder.addFile(file2);

        folder.displayContents();

        File file3 = new File("Presentation.ppt", 4096);
        folder.addFile(file3);

        folder.displayContents();

        folder.removeFile("Image.jpg");

        folder.displayContents();
    }
}
