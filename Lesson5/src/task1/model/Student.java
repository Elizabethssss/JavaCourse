package task1.model;

public class Student {
    private String surname;
    private String name;
    private String birth;
    private String telephone;
    private String address;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() { }

    public Student(String surname, String name, String birth, String telephone, String address) {
        this.surname = surname;
        this.name = name;
        this.birth = birth;
        this.telephone = telephone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student: surname = " + surname + ", name = " + name + ", birth = " + birth + ", telephone = "
                + telephone + ", address = " + address;
    }
}
