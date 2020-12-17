package model4.task1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

class Writelist {

    public static void writelist(List list){
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("D:\\model4\\student.txt"));
            out.writeObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (out!=null){
                try {
                    out.close();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}

