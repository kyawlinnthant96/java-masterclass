public class Student {
    private String id;
    private String name;
    private String email;
    private String classLists;

    public Student(String id, String name, String email, String classLists) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.classLists = classLists;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", classLists='" + classLists + '\'' +
                '}';
    }
}
