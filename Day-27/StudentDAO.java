class StudentDAO {

    void saveStudent(int id, String name) {
        System.out.println("Saving student: " + id + " " + name);
    }

}

class Service {

    void addStudent() {
        StudentDAO dao = new StudentDAO();
        dao.saveStudent(101, "Niteesh");
    }

}

class Demo {
    public static void main(String[] args) {

        Service s = new Service();
        s.addStudent();

    }
}