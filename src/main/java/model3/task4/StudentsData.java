package model3.task4;

import java.util.ArrayList;

public class StudentsData {
    private ArrayList<StudentNode> head;
    private static StudentsData instance = new StudentsData();

    private StudentsData() {
        head = new ArrayList<StudentNode>();
    }

    public static StudentsData getInstance() {
        return instance;
    }
    //增加元素
    public boolean addElement(StudentNode node) {
        StudentNode find = findElement(node.stuNo);
        if(find != null) {
            System.out.println("已存在相同学号记录！");
            System.out.println(find);
            return false;
        }
        return head.add(node);
    }

    //查找元素
    public StudentNode findElement(int studentNo) {
        for(StudentNode node : head) {
            if(studentNo == node.stuNo) return node;
        }
        return null;
    }

    //返回元素index位置
    public int findElementIndex(int studentNo) {
        return head.indexOf(new StudentNode(studentNo,"",99));
    }

    //修改元素
    public StudentNode setElement(int index, StudentNode node) {
        return head.set(index, node);
    }

    //遍历集合
    public void traverse() {
        for(StudentNode node : head) {
            System.out.println(node);
        }
    }

    //删除元素 根据传入的学号删除元素
    public boolean removeElement(int studentNo) {
        StudentNode node = findElement(studentNo);
        if(null == node) {
            System.out.println("无此学号， 删除失败！");
            return false;
        }
        return head.remove(node);
    }
}
