package create.builderMode;

import model.Student;

/**
 * Created by zengjianlu on 2018/2/23.
 *
 * 1.聚合要创建的类，构建器的构造方法创建这个聚合类的对象，
 * 2.提供要赋值的属性方法，并返回构建器
 * 3.提供build方法返回聚合的对象
 *
 * 如果只能通过构建器创建对象需要将被构建类的构造方法私有，并将构建器做成内部静态类
 *
 *
 */
public class StudentBuilder {
    private Student student;
    public StudentBuilder(){
        student = new Student();
    }
    public StudentBuilder age(Integer age){
        student.setAge(age);
        return this;
    }

    public StudentBuilder name(String name){
        student.setName(name);
        return this;
    }

    public StudentBuilder address(String address){
        student.setAddress(address);
        return this;
    }

    public Student build(){
        return student;
    }
}
