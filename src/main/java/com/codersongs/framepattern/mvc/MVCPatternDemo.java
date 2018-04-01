package com.codersongs.framepattern.mvc;
/**
 *
 * MVC模式，注意MVC是一种框架模式，不是设计模式
 *
 * <p>
 * MVC模式，即Model, View, Controller是java web中常用的模式，控制器将对象操作和视图渲染
 * 解耦，便于独立扩展变化
 */
public class MVCPatternDemo {
    public static void main(String[] args) {

        //从数据可获取学生记录
        Student model  = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}