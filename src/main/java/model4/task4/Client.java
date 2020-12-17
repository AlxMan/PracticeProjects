package model4.task4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        Socket s=null;
        try {
            s = new Socket("127.0.0.1", 8888);
            System.out.println("客户端启用~~");
            User user=new User("admin","123456");
            UserMessage um=new UserMessage();
            um.setUser(user);
            // 创建对象输出流
            out = new ObjectOutputStream(s.getOutputStream());
            // 发出对象
            out.writeObject(um);
            // 创建对象输入流
            in = new ObjectInputStream(s.getInputStream());
            // 获取服务端返回的UserMessage对象
            um = (UserMessage)in.readObject();
            // 打印结果
            if ("success".equals(um.getTYPE())) {
                System.out.println("登陆成功");
            }else{
                System.out.println("登陆失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=in){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=s){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}



