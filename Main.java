/**
 * Created by Olenkaa on 05.02.2017.
 */
public class Main {
    public static void main(String args[]){
        Directory root = new Directory();

        Directory d = new Directory();
        Directory d1 = new Directory();

        File f = new File(10);
        File f1 = new File(20);
        root.addFileOrDirectory(f);
        root.addFileOrDirectory(d);
        d.addFileOrDirectory(f1);
        System.out.println(root.getSize());

    }
}
