package model4.task4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        ObjectOutputStream out=null;
        ObjectInputStream in=null;
        ServerSocket ss=null;
        Socket accept = null;
        try {
            ss=new ServerSocket(8888);
            System.out.println("服务器启动_监听中");
            Thread.sleep(1000);
            accept = ss.accept();
            in=new ObjectInputStream(accept.getInputStream());
            Object o = in.readObject();
            //流对象强制转换
            UserMessage msg=(UserMessage)o;
            User user = msg.getUser();
            //判断
            if ( "admin".equals(user.getUsername())&&"123456".equals(user.getPasword())){
                msg.setTYPE("success");
            }else {
                msg.setTYPE("fail");
            }
            out=new ObjectOutputStream(accept.getOutputStream() );
            out.writeObject(msg);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != accept) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}

