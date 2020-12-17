package model4.task3;

import java.io.*;

public class CopyFile {
        public static void Copy(String path1,String path2){
            BufferedReader br=null;
            BufferedWriter bw=null;
            try {
                br=new BufferedReader(new FileReader(path1));
                bw=new BufferedWriter(new FileWriter(path2));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String str=null;
            try {
                while ((str=br.readLine())!=null){
                    bw.write(str);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (null!=bw){
                        bw.close();
                    }
                    if (null!=br){
                        br.close();
                    }
                    ;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
