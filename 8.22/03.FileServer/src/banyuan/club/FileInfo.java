package banyuan.club;

public class FileInfo {
    private String path;
    private int length;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName(){
        String substring = path.substring(path.lastIndexOf("/"), path.length()-1);
        return substring;
    }
}
