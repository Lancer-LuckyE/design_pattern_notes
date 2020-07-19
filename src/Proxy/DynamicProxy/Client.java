package Proxy.DynamicProxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDAO teacherDAO = new TeacherDAO();
        ITeacherDAO proxyInstance = (ITeacherDAO) new ProxyFactory(teacherDAO).getProxyInstance();
        proxyInstance.teach("Hello world");
    }
}
