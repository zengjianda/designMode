package create.prototypeMode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengjianlu on 2018/2/23.
 * 原型模式主要注意浅拷贝和深拷贝的问题
 *
 */
public class Prototype implements Cloneable,Serializable{
    /* 浅复制 */
    public Object shallowClone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /* 深复制 */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    private String name;
    private String address;
    private Integer age;
    private List<String> interest;

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }

    public Prototype(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Prototype(String name, String address, Integer age, List<String> interest) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", interest=" + interest +
                '}';
    }

    public static void main(String[] args) {
        List<String> interest = new ArrayList<String>();
        interest.add("read");
        interest.add("music");
        Prototype prototype = new Prototype("dada","浦东",11,interest);
        try {
            Prototype copy = (Prototype) prototype.shallowClone();
            copy.setAddress("徐汇");
            copy.setAge(15);
            copy.getInterest().add("movie");
            Prototype deepCopy = (Prototype) prototype.deepClone();
            deepCopy.interest.add("sports");
            System.out.println("prototype:" + prototype);
            System.out.println("copy:" + copy);
            System.out.println("deepCopy:" + deepCopy);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
