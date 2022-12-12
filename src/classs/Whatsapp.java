package classs;


import enumm.Status;

public class  Whatsapp {

    private String id;
    private String firstName;
    private String phoneNumber;
    private String password;
    private Status status = Status.HI_I_USE_WHATSAPP;

    public Whatsapp(int id, String firstName, String phoneNumber, String password) {
        this.id = id;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }




    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String  toString() {
        return "Whatsapp{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
