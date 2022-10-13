public class Person extends Customer{
    private String nationalIdnetity;
    private String firstName;
    private String lastName;

    public String getNationalIdnetity() {
        return nationalIdnetity;
    }

    public void setNationalIdnetity(String nationalIdnetity) {
        this.nationalIdnetity = nationalIdnetity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
