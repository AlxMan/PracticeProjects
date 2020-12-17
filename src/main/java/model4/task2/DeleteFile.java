package model4.task2;


import java.io.File;

public class DeleteFile {
    public static void de(String src){
        File file=new File(src);
        if (!file.exists()){
            System.out.println("目录不存在");
            return;
        }

        for (File f : file.listFiles()){
            if (f.isFile()){
                f.delete();
            }else {
                DeleteFile.de(f.getAbsolutePath());
            }
        }
        file.delete();
        System.out.println(file.getName()+"删除成功！");

    }

    public static void main(String[] args) {
        DeleteFile.de("D:\\model4\\abc");
    }
}

