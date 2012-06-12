import java.io.File;
import java.io.FileOutputStream;

class FirstApp {
    public static void main (String[] args) throws Exception {
        //toto tatat
        String root = "/tmp/poa/in" ;
        StringBuilder path = new StringBuilder(root) ;
        int id = 1000 ;
        String fileName = String.valueOf(id) ;
        for (int i = 100000 ; i >= 1 ; i/=10) {
            path.append("/").append(id/i);
            id = id % i ;
        }
        new File(path.toString()).mkdirs();
        //toto tatat

    }
}

