import java.util.ArrayList;

public class Folder {
    
    private String name;

    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(String fileName) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getName().equals(fileName)) {
                files.remove(i);
                System.out.println("File '" + fileName + "' removed from folder.");
                return;
            }
        }
        System.out.println("File '" + fileName + "' not found in folder.");
    }

    public void displayContents() {
        System.out.println("Folder Contents:");
        for (File file : files) {
            System.out.println(file.getName() + " - Size: " + file.getSize());
        }
        System.out.println("End of Folder Contents");
    }
}
