package model4.task1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Readlist {
    public static List readlist(){
        ObjectInputStream in=null;
        List list=null;
        try {
            in = new ObjectInputStream(new FileInputStream("./abc.txt"));
            Object o = in.readObject();
            list=(List) o;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (null!=in){
                try {
                    in.close();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

}
