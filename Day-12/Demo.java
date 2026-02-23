class Person {

    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Constructor called");
    }

}

class Student extends Person {

    int id;

    Student(String name, int id) {
        super(name);
        this.id = id;
    }

    void display() {
        System.out.println(name + " " + id);
    }

}

class Demo {
    public static void main(String[] args) {

        Student s = new Student("Niteesh", 101);
        s.display();

    }
}