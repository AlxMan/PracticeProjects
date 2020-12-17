package model4.task3;


import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopeFolders {
    public static void Copy(String path1,String path2) {
        File file = new File(path1);
        File file1 = new File(path2);
        if (!file.exists()) {
            System.out.println("目录不存在！");
            return;
        }

        if (!file1.exists()) {
            file1.mkdirs();
            System.out.println(file1 + "  复制成功");
        }


        //创建一个线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (File f : file.listFiles()) {
            service.submit(() -> {
                if (f.isFile()) {
                    CopyFile.Copy(f.getAbsolutePath(), file1.getAbsolutePath() + "/" + f.getName());
                    System.out.println(f.getName() + "复制成功");
                } else {
                    CopeFolders.Copy(f.getAbsolutePath(), file1.getAbsolutePath() + "/" + f.getName());
                }
            });

        }

        service.shutdown();
    }

    public static void main(String[] args) {
        CopeFolders copeFolders = new CopeFolders();
        copeFolders.Copy("D:\\model4","D:\\abc");
    }
    }

