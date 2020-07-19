package Proxy.DynamicProxy;

public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach(String content) {
        System.out.println(content);
    }
}
