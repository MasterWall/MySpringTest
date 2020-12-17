package com.example.ioc.xmldemo;

/**
 * @author cyx
 * @date 2020/12/11
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

//    构造器
    public Emp(String ename, String gender) {
        this.ename = ename;
        this.gender = gender;
    }


    public Emp() {
    }

    public void add() {
        System.out.println("注意xml文件要放在resources文件夹下！！！！！！");
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
