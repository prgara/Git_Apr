
public class Student{
    String subject;
    String section;


    int id;
    String name;
    int age;
    String city;
    char section;


    public Student(int id, String name, int age, String city,char section) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.section=section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    }

    public String getSubject() {

        return subject;
    }

    public void setSubject(String subject) {

        this.subject = subject;
    }

    public String getSection() {

        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
