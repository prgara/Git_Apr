public class Student {



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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
