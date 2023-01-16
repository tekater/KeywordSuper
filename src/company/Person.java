package company;

class Person {
    protected String name;
    protected int yearsOfBirth;
    protected String address;

    public Person(String name, int yearsOfBirth, String address) {
        this.name = name;
        this.yearsOfBirth = yearsOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfBirth() {
        return yearsOfBirth;
    }
    public void setYearsOfBirth(int yearsOfBirth) {
        this.yearsOfBirth = yearsOfBirth;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
/*@Override
    public String toString () {
        return "Person{" +
                "Name=" + name +
                ", Years of Birth=" + yearsOfBirth +
                ", Address=" + address +
                '}';
    }*/
}
