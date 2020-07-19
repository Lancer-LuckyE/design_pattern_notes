package Proxy.StaticProxy;

public class TeacherDAOProxy implements ITeacherDAO {
    private ITeacherDAO iTeacherDAO;

    public TeacherDAOProxy (ITeacherDAO iTeacherDAO) {
        this.iTeacherDAO = iTeacherDAO;
    }

    @Override
    public void teach() {
        System.out.println("Proxy starts...");
        iTeacherDAO.teach();
        System.out.println("Proxy ends...");
    }
}
