/**
 * Created by Olenkaa on 05.02.2017.
 */
public class File implements FileOrDirectory {
    private   int size;

    public File() {
    }

    public File(int size) {
        this.size = size;
    }

    @Override
    public  int getSize() {
        return size;
    }


    public  void setSize(int size) {
        this.size = size;
    }

    @Override
    public  String toString() {
        return "File{" +
                "size=" + size +
                '}';
    }
}
