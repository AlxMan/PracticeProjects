package model3.task4;

import java.util.Scanner;

public class InputMenu {
    public static void main(String[] args) {
        StudentsData dat = StudentsData.getInstance();
        Scanner sc = new Scanner(System.in);
        String ch;
        int index;

        while(!(ch = menu()).equalsIgnoreCase("EXIT")) {
            switch (ch) {
                case "1":
                    System.out.print("请依次输入学号, 姓名, 年龄:");
                    dat.addElement(new StudentNode(sc.nextInt(), sc.next(), sc.nextInt()));
                    break;

                case "2":
                    System.out.println("请输入需修改信息学生的学号:");
                    index = dat.findElementIndex(sc.nextInt());
                    if(index == -1){
                        System.out.println("无此学号信息!");
                    }
                    else {
                        System.out.println("请依次输入新的学号, 姓名, 年龄");
                        dat.setElement(index, new StudentNode(sc.nextInt(), sc.next(), sc.nextInt()));
                    }
                    break;
                case "3":
                    System.out.println("请输入需要删除的学生的学号:");
                    dat.removeElement(sc.nextInt());
                    break;
                case "4":
                    System.out.println("请输入需查找的学号信息:");
                    StudentNode node = dat.findElement(sc.nextInt());
                    if(node == null) {
                        System.out.println("无此学号信息!");
                    } else {
                        System.out.println(node);
                    }
                    break;
                case "5":
                    dat.traverse();
                    break;
                default:
                    System.out.println("输入错误,请重新选择选项!");
            }
        }
    }

    private static String menu() {
        System.out.println("***********************************************");
        System.out.println("****************学生信息管理系统****************");
        System.out.println("      操作选项     说明");
        System.out.println("--------------     -----------");
        System.out.println("         1         新增学生信息");
        System.out.println("         2         修改学生信息");
        System.out.println("         3         删除学生信息");
        System.out.println("         4         查找学生信息");
        System.out.println("         5         遍历学生信息");
        System.out.println("         EXIT      退出");
        System.out.println("***********************************************");
        Scanner sc = new Scanner(System.in);
        return sc.next().trim();
    }


}
