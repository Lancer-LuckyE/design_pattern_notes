package Proxy.StaticProxy;

public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach() {
        System.out.println("Teacher is teaching...");
    }
}
