import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olenkaa on 05.02.2017.
 */
public class Directory implements FileOrDirectory {
    private List<FileOrDirectory> fd = new ArrayList<>();
    Directory(){

    }

    public void addFileOrDirectory(FileOrDirectory f){
        fd.add(f);
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (FileOrDirectory fod : fd) {
            sum += fod.getSize();
        }
        return sum;
    }

    private void chack(FileOrDirectory directory) {
        if (directory.equals(this)) {
            throw new IllegalArgumentException("Impossible");
        }
    }
    }

