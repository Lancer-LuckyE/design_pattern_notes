package Prototype.DeepClone;

import java.io.*;

public class DeepCloneSheep implements Serializable, Cloneable {
    private String name;
    private String color;
    private int age;
    private DeepCloneSheep friend;

    public DeepCloneSheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepCloneSheep getFriend() {
        return friend;
    }

    public void setFriend(DeepCloneSheep friend) {
        this.friend = friend;
    }

    public Boolean hasFriend() {
        if (this.friend != null){
            return true;
        }
        return false;
    }

    public String toString() {
        return "[name: " + getName() + ", age: " + getAge() + ", color: " + getColor() + "];";
    }

    public String printFriendAddress(){
        return "Friend object address: " + getFriend().hashCode() + "\n\n";
    }

//    第一种是重写clone方法。
//    1. 先用 super.clone 来实现primitive datatypes 的拷贝。
//    2. 然后克隆引用类型，在引用类型的类里也要事先实现 clone方法。
//    引用类型多的时候不太好，每一个都要单独处理clone
    @Override
    protected DeepCloneSheep clone() {
        DeepCloneSheep deepCloneSheep = null;
        try{
            Object primitive = null;
            primitive = super.clone();
            deepCloneSheep = (DeepCloneSheep) primitive;
            if(hasFriend()) {
                DeepCloneSheep friend = (DeepCloneSheep) deepCloneSheep.getFriend().clone();
                deepCloneSheep.setFriend(friend);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return deepCloneSheep;
    }

//    第二种是用对对象的序列化来实现的。推荐使用
//    相当于是将this 实例以对象流的方式写到内存里，再用对象输入流从内存里读回来。
//    在读的时候会自动拷贝一份
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Object copy = null;
        try {
//            Serialization
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
//            Deserializaation
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally { // !!!!!! important !!!!!!! Close the opened streams
            closeStream(ois);
            closeStream(bis);
            closeStream(oos);
            closeStream(bos);
        }
        return copy;
    }

    private void closeStream(OutputStream out) {
        try {
            if(out != null) {
                out.close();
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private void closeStream(InputStream in) {
        try {
            if(in != null) {
                in.close();
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
