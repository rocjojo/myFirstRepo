import java.io.RandomAccessFile;
import java.nio.channels.*;

public class FileLocking {
  public static void main(String[] args) throws Exception {
    FileChannel channel = new RandomAccessFile("/tmp/poa/in/_lock", "rw").getChannel();
    FileLock fl = channel.lock();
    if(fl != null) {
      System.out.println("Locked File");
      Thread.sleep(5000);
      fl.release();
      System.out.println("Released Lock");
    } else {
      System.out.println("pas possib");
        
    }
    channel.close();
  }
} ///:~

